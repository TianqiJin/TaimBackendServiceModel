package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorDTO {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String userType;
    private String gstNumber;
}
