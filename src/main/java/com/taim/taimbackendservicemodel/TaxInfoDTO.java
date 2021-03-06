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
public class TaxInfoDTO {
    private long id;
    private String taxType;
    private BigDecimal taxRate;
    private BigDecimal taxAmount;
    private BigDecimal taxAmountByOne;
}
