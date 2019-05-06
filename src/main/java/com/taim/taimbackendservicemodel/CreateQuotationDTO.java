package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateQuotationDTO {
    private String quotationId;
    private long customerId;
    private long staffId;
    private List<CreateQuotationDetailDTO> createQuotationDetailDTOList;
    private String note;
    private String status;
    private Date quotationDate;
    private Date dueDate;
}
