package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by tjin on 2017-07-28.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDetailDTO {
    private long id;
    private ProductDTO product;
    private BigDecimal quantity;
    private BigDecimal total;
    private BigDecimal discount;
    private BigDecimal unitPrice;
    private List<TaxInfoDTO> taxInfos;
    private BigDecimal subtotal;
    private String note;
}
