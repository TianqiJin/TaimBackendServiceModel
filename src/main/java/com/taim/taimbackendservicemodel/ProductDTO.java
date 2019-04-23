package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created by tjin on 2017-07-28.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private long id;
    private String sku;
    private String description;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private String displayName;
    private String texture;
    private String color;
    private BigDecimal totalNum;
    private BigDecimal totalNumVirtual;
    private BigDecimal unitPrice;
    private BigDecimal piecePerBox;
}
