package com.datainsert.data_insert.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity(name = "request_track")
@Data
public class RequestTrack {
    @Id
    private int requestTrackId;
    private String service;
    private String mobileNo;
    private String voterCardNo;
    private Integer cadreId;
    private String membershipId;
    private Date requestTime;
    private Date responseTime;
    private Integer timeTaken;
    private String requestStatus;

}
