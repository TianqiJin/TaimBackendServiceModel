package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private long id;
    private String streetNum;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String province;
    private String country;
    private String postalCode;
}
