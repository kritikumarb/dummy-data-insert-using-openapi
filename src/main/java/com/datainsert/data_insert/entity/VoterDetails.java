package com.datainsert.data_insert.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "voter_details")
public class VoterDetails {
    @Id
    private int voterDetailsId;
    private Long stateId;
    private Long districtId;
    private String districtName;
    private Long constituencyId;
    private String constituencyName;
    private Long mandalId;
    private String mandalName;
    private Long townId;
    private String townName;
    private Long villageId;
    private String villageName;
    private Long wardId;
    private String wardName;
    private Long boothId;
    private String partNo;
    private String presentBooth;
    private Long serialNo;
    private Long voterId;
    private String voterCardNo;
    private String newVoterCardNo;
    private String voterName;
    private String voterTeluguName;
    private String age;
    private String gender;
    private String relativeName;
    private String relativeNameTelugu;
    private String relation;
    private String houseNo;

    // Getters and Setters
}
