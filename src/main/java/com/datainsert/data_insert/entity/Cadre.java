package com.datainsert.data_insert.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "cadre")
public class Cadre {
    @Id
    private long cadreId;
    private Long voterId;
    private Integer familyVoterId;
    private String voterCardNo;
    private String newVoterCardNo;
    private String membershipId;
    private String cadreName;
    private String relativeName;
    private String cadreTeluguName;
    private String relation;
    private String houseNo;
    private String mobileNo;
    private String gender;
    private Integer age;
    private String image;
    private Long educationId;
    private Long occupationId;
    private Date dateOfBirth;
    private Long casteId;
    private Date insertedTime;
    private Date updateTime;
    private String dataSourceType;
    private String nomineeName;
    private Long nomineeRelationId;
    private String nomineeRelation;
    private Integer nomineeAge;
    private String nomineeGender;
    private String isRelative;
    private Integer ageRangeId;
    private String emailId;
    private Long stateId;
    private String stateName;
    private Long districtId;
    private String districtName;
    private Long constituencyId;
    private String constituencyName;
    private Long parliamentId;
    private String parliamentName;
    private Long mandalId;
    private String mandalName;
    private Long villageId;
    private String villageName;
    private Long townId;
    private String townName;
    private Long wardId;
    private String wardName;
    private Long boothId;
    private String partNo;
    private String pincode;
    private String street;
    private String landMark;
    private String addressLane1;
    private String addressLane2;
    private String imageStatus;
    private String membershipType;
    private String isEnrolled;
}
