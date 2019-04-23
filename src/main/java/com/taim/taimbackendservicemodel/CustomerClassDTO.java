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
public class CustomerClassDTO {
    private long id;
    private String customerClassName;
    private BigDecimal customerDiscount;
    private String description;
}
