package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerDTO {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private BigDecimal storeCredit;
    private String customerClassName;
    private String userType;
    private String pstNumber;
}
