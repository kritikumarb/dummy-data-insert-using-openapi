package com.datainsert.data_insert.mapper;

import com.datainsert.data_insert.dto.CadreDTO;
import com.datainsert.data_insert.entity.Cadre;
import org.springframework.stereotype.Component;

@Component
public class CadreMapper {

    // Convert Cadre entity to CadreDTO
    public CadreDTO toDTO(Cadre cadre) {
        CadreDTO dto = new CadreDTO();
        dto.setCadreId(cadre.getCadreId());
        dto.setVoterId(cadre.getVoterId());
        dto.setFamilyVoterId(cadre.getFamilyVoterId());
        dto.setVoterCardNo(cadre.getVoterCardNo());
        dto.setNewVoterCardNo(cadre.getNewVoterCardNo());
        dto.setMembershipId(cadre.getMembershipId());
        dto.setCadreName(cadre.getCadreName());
        dto.setRelativeName(cadre.getRelativeName());
        dto.setCadreTeluguName(cadre.getCadreTeluguName());
        dto.setRelation(cadre.getRelation());
        dto.setHouseNo(cadre.getHouseNo());
        dto.setMobileNo(cadre.getMobileNo());
        dto.setGender(cadre.getGender());
        dto.setAge(cadre.getAge());
        dto.setImage(cadre.getImage());
        dto.setEducationId(cadre.getEducationId());
        dto.setOccupationId(cadre.getOccupationId());
        dto.setDateOfBirth(cadre.getDateOfBirth());
        dto.setCasteId(cadre.getCasteId());
        dto.setInsertedTime(cadre.getInsertedTime());
        dto.setUpdateTime(cadre.getUpdateTime());
        dto.setDataSourceType(cadre.getDataSourceType());
        dto.setNomineeName(cadre.getNomineeName());
        dto.setNomineeRelationId(cadre.getNomineeRelationId());
        dto.setNomineeRelation(cadre.getNomineeRelation());
        dto.setNomineeAge(cadre.getNomineeAge());
        dto.setNomineeGender(cadre.getNomineeGender());
        dto.setIsRelative(cadre.getIsRelative());
        dto.setAgeRangeId(cadre.getAgeRangeId());
        dto.setEmailId(cadre.getEmailId());
        dto.setStateId(cadre.getStateId());
        dto.setStateName(cadre.getStateName());
        dto.setDistrictId(cadre.getDistrictId());
        dto.setDistrictName(cadre.getDistrictName());
        dto.setConstituencyId(cadre.getConstituencyId());
        dto.setConstituencyName(cadre.getConstituencyName());
        dto.setParliamentId(cadre.getParliamentId());
        dto.setParliamentName(cadre.getParliamentName());
        dto.setMandalId(cadre.getMandalId());
        dto.setMandalName(cadre.getMandalName());
        dto.setVillageId(cadre.getVillageId());
        dto.setVillageName(cadre.getVillageName());
        dto.setTownId(cadre.getTownId());
        dto.setTownName(cadre.getTownName());
        dto.setWardId(cadre.getWardId());
        dto.setWardName(cadre.getWardName());
        dto.setBoothId(cadre.getBoothId());
        dto.setPartNo(cadre.getPartNo());
        dto.setPincode(cadre.getPincode());
        dto.setStreet(cadre.getStreet());
        dto.setLandMark(cadre.getLandMark());
        dto.setAddressLane1(cadre.getAddressLane1());
        dto.setAddressLane2(cadre.getAddressLane2());
        dto.setImageStatus(cadre.getImageStatus());
        dto.setMembershipType(cadre.getMembershipType());
        dto.setIsEnrolled(cadre.getIsEnrolled());

        return dto;
    }

    // Convert CadreDTO to Cadre entity
    public Cadre toEntity(CadreDTO dto) {
        Cadre cadre = new Cadre();
        cadre.setCadreId(dto.getCadreId());
        cadre.setVoterId(dto.getVoterId());
        cadre.setFamilyVoterId(dto.getFamilyVoterId());
        cadre.setVoterCardNo(dto.getVoterCardNo());
        cadre.setNewVoterCardNo(dto.getNewVoterCardNo());
        cadre.setMembershipId(dto.getMembershipId());
        cadre.setCadreName(dto.getCadreName());
        cadre.setRelativeName(dto.getRelativeName());
        cadre.setCadreTeluguName(dto.getCadreTeluguName());
        cadre.setRelation(dto.getRelation());
        cadre.setHouseNo(dto.getHouseNo());
        cadre.setMobileNo(dto.getMobileNo());
        cadre.setGender(dto.getGender());
        cadre.setAge(dto.getAge());
        cadre.setImage(dto.getImage());
        cadre.setEducationId(dto.getEducationId());
        cadre.setOccupationId(dto.getOccupationId());
        cadre.setDateOfBirth(dto.getDateOfBirth());
        cadre.setCasteId(dto.getCasteId());
        cadre.setInsertedTime(dto.getInsertedTime());
        cadre.setUpdateTime(dto.getUpdateTime());
        cadre.setDataSourceType(dto.getDataSourceType());
        cadre.setNomineeName(dto.getNomineeName());
        cadre.setNomineeRelationId(dto.getNomineeRelationId());
        cadre.setNomineeRelation(dto.getNomineeRelation());
        cadre.setNomineeAge(dto.getNomineeAge());
        cadre.setNomineeGender(dto.getNomineeGender());
        cadre.setIsRelative(dto.getIsRelative());
        cadre.setAgeRangeId(dto.getAgeRangeId());
        cadre.setEmailId(dto.getEmailId());
        cadre.setStateId(dto.getStateId());
        cadre.setStateName(dto.getStateName());
        cadre.setDistrictId(dto.getDistrictId());
        cadre.setDistrictName(dto.getDistrictName());
        cadre.setConstituencyId(dto.getConstituencyId());
        cadre.setConstituencyName(dto.getConstituencyName());
        cadre.setParliamentId(dto.getParliamentId());
        cadre.setParliamentName(dto.getParliamentName());
        cadre.setMandalId(dto.getMandalId());
        cadre.setMandalName(dto.getMandalName());
        cadre.setVillageId(dto.getVillageId());
        cadre.setVillageName(dto.getVillageName());
        cadre.setTownId(dto.getTownId());
        cadre.setTownName(dto.getTownName());
        cadre.setWardId(dto.getWardId());
        cadre.setWardName(dto.getWardName());
        cadre.setBoothId(dto.getBoothId());
        cadre.setPartNo(dto.getPartNo());
        cadre.setPincode(dto.getPincode());
        cadre.setStreet(dto.getStreet());
        cadre.setLandMark(dto.getLandMark());
        cadre.setAddressLane1(dto.getAddressLane1());
        cadre.setAddressLane2(dto.getAddressLane2());
        cadre.setImageStatus(dto.getImageStatus());
        cadre.setMembershipType(dto.getMembershipType());
        cadre.setIsEnrolled(dto.getIsEnrolled());

        return cadre;
    }
}