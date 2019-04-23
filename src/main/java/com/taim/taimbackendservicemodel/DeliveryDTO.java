package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created by tjin on 2017-08-01.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDTO {
    private long id;
    private ProductDTO product;
    private BigDecimal deliveryAmount;
}
