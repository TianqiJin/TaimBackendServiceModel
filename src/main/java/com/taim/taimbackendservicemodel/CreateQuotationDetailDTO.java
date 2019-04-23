package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateQuotationDetailDTO {
    private String productSku;
    private BigDecimal unitPrice;
    private BigDecimal quantity;
    private BigDecimal discount;
    private String note;
}
