package com.datainsert.data_insert.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "invalid_mobile")
public class InvalidMobile {
    @Id
    private int invalidMobileId;
    private String mobileNo;

    // Getters and Setters
}
