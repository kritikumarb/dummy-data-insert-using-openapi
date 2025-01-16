package com.datainsert.data_insert.service;

import com.datainsert.data_insert.dto.CadreDTO;
import com.datainsert.data_insert.entity.Cadre;
import com.datainsert.data_insert.mapper.CadreMapper;
import com.datainsert.data_insert.repository.CadreRepository;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.converter.BeanOutputConverter;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AiDataInsertService {

    BeanOutputConverter<CadreDTO> beanOutputConverter = new BeanOutputConverter<>(CadreDTO.class);
    private final ChatClient chatClient;
    private final CadreMapper cadreMapper;
    private final CadreRepository cadreRepository;

    public AiDataInsertService(ChatClient.Builder chatClientBuilder, CadreMapper cadreMapper, CadreRepository cadreRepository) {
        this.chatClient = chatClientBuilder.build();
        this.cadreMapper = cadreMapper;
        this.cadreRepository = cadreRepository;
    }
    String userMsg = """
             Your response should be in JSON format.
              Do not include any explanations, only provide a RFC8259 compliant JSON response following this format without deviation.
              
              Generate a list of fake data entries for the Cadre entity based on the following rules:
              cadreId: A unique long value starting from 1 and incrementing by 1 for each entry.
              voterId: A unique long value representing a voter ID. Ensure it is a 10-digit number.
              familyVoterId: A nullable integer representing a family voter ID. Use a 6-digit number if populated.
              voterCardNo: A string representing a voter card number. Use the format "ABC1234567".
              newVoterCardNo: A string representing a new voter card number. Use the format "XYZ9876543".
              membershipId: A string representing a membership ID. Use the format "MEM123456".
              cadreName: A string representing the cadre's full name. Use realistic Indian names (e.g., "Rahul Sharma").
              relativeName: A string representing the name of a relative. Use realistic Indian names (e.g., "Sunita Sharma").
              cadreTeluguName: A string representing the cadre's name in Telugu (e.g., "రాహుల్ శర్మ").
              relation: A string representing the relationship (e.g., "Father", "Mother", "Spouse").
              houseNo: A string representing a house number (e.g., "12-34/A").
              mobileNo: A string representing a 10-digit Indian mobile number starting with 7, 8, or 9.
              gender: A string representing gender. Use "Male", "Female", or "Other".
              age: An integer representing age. Use values between 18 and 80.
              image: A string representing an image URL. Use a placeholder URL like "https://example.com/image1.jpg".
              educationId: A long value representing an education ID. Use values between 1 and 10.
              occupationId: A long value representing an occupation ID. Use values between 1 and 20.
              dateOfBirth: A date in the format "yyyy-MM-dd". Ensure the age matches the date of birth.
              casteId: A long value representing a caste ID. Use values between 1 and 50.
              insertedTime: A timestamp in the format "yyyy-MM-dd HH:mm:ss ". Use recent dates.
              updateTime: A timestamp in the format "yyyy-MM-dd HH:mm:ss ". Use recent dates, later than insertedTime.
              dataSourceType: A string representing the data source type (e.g., "Manual", "API").
              nomineeName: A string representing the nominee's name. Use realistic Indian names.
              nomineeRelationId: A long value representing the nominee's relation ID. Use values between 1 and 10.
              nomineeRelation: A string representing the nominee's relationship (e.g., "Son", "Daughter").
              nomineeAge: An integer representing the nominee's age. Use values between 1 and 70.
              nomineeGender: A string representing the nominee's gender. Use "Male", "Female", or "Other".
              isRelative: A string representing whether the nominee is a relative. Use "Yes" or "No".
              ageRangeId: An integer representing an age range ID. Use values between 1 and 5.
              emailId: A string representing an email address. Use realistic email formats (e.g., "rahul.sharma@gmail.com").
              stateId: A long value representing a state ID. Use values between 1 and 30.
              stateName: A string representing the state name. Use real Indian state names (e.g., "Telangana").
              districtId: A long value representing a district ID. Use values between 1 and 100.
              districtName: A string representing the district name. Use real Indian district names (e.g., "Hyderabad").
              constituencyId: A long value representing a constituency ID. Use values between 1 and 500.
              constituencyName: A string representing the constituency name. Use realistic names (e.g., "Karimnagar").
              parliamentId: A long value representing a parliament ID. Use values between 1 and 50.
              parliamentName: A string representing the parliament name. Use realistic names (e.g., "Lok Sabha").
              mandalId: A long value representing a mandal ID. Use values between 1 and 200.
              mandalName: A string representing the mandal name. Use realistic names (e.g., "Sircilla").
              villageId: A long value representing a village ID. Use values between 1 and 1000.
              villageName: A string representing the village name. Use realistic names (e.g., "Gollapalli").
              townId: A long value representing a town ID. Use values between 1 and 500.
              townName: A string representing the town name. Use realistic names (e.g., "Warangal").
              wardId: A long value representing a ward ID. Use values between 1 and 100.
              wardName: A string representing the ward name. Use realistic names (e.g., "Ward 12").
              boothId: A long value representing a booth ID. Use values between 1 and 1000.
              partNo: A string representing a part number. Use the format "Part-123".
              pincode: A string representing a 6-digit Indian pincode.
              street: A string representing a street name. Use realistic names (e.g., "Gandhi Road").
              landMark: A string representing a landmark. Use realistic names (e.g., "Near Temple").
              addressLane1: A string representing the first line of the address. Use realistic addresses.
              addressLane2: A string representing the second line of the address. Use realistic addresses.
              imageStatus: A string representing the image status. Use "Uploaded", "Pending", or "Rejected".
              membershipType: A string representing the membership type. Use "Primary", "Secondary", or "Associate".
              isEnrolled: A string representing whether the cadre is enrolled. Use "Yes" or "No".
              {format}
            """;
    public CadreDTO getFakeDataForCadre() {
        try{
            String format = beanOutputConverter.getFormat();
            PromptTemplate promptTemplate = new PromptTemplate(userMsg);
            Prompt prompt = promptTemplate.create(Map.of("format", format));

            ChatResponse chatResponse = chatClient.prompt(prompt).call().chatResponse();
            CadreDTO cadre = beanOutputConverter.convert(chatResponse.getResult().getOutput().getContent());
            cadreRepository.save(convertResponse(cadre));
            return cadre;
        }catch (Exception e){
            System.out.println("Error occured in AI response");
            return null;
        }
    }

    public Cadre convertResponse(CadreDTO cadreDTO){
        return cadreMapper.toEntity(cadreDTO);
    }

    public String getAiResponse(String prompt) {
        ChatResponse chatResponse = chatClient.prompt(prompt).call().chatResponse();
        return chatResponse.getResult().getOutput().getContent();
    }


}
