package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by tjin on 2017-07-23.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private List<AddressDTO> addresses;
    private BigDecimal storeCredit;
    private CustomerClassDTO customerClass;
    private String userType;
    private String pstNumber;
}
