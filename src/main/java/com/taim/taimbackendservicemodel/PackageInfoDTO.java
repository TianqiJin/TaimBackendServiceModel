package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created by Tjin on 8/19/2017.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PackageInfoDTO {
    private long id;
    private BigDecimal box;
    private BigDecimal pieces;
}
