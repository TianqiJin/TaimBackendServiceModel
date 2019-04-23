package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Tjin on 7/15/2017.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private List<AddressDTO> addresses;
    private String userName;
    private String password;
    private String position;
}
