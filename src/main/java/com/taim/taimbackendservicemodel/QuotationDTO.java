package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuotationDTO {
    private long id;
    private String quotationId;
    private Date quotationDate;
    private Date dueDate;
    private BigDecimal subtotal;
    private BigDecimal total;
    private BigDecimal totalTax;
    private StaffDTO staff;
    private CustomerDTO customer;
    private String transactionType;
    private List<TransactionDetailDTO> transactionDetails;
    private String refId;
    private String status;
    private String note;
    private String billToAddress;
    private String billFromAddress;
}
