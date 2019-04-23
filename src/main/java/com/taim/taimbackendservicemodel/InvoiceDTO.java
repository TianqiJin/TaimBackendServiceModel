package com.taim.taimbackendservicemodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDTO {
    private long id;
    private BigDecimal subtotal;
    private BigDecimal total;
    private BigDecimal totalTax;
    private StaffDTO staff;
    private CustomerDTO customer;
    private String transactionType;
    private String paymentStatus;
    private String deliveryStatus;
    private Date paymentDueDate;
    private Date deliveryDueDate;
    private List<TransactionDetailDTO> transactionDetails;
    private List<PaymentDTO> payments;
    private List<DeliveryDTO> deliveries;
    private long refId;
    private boolean finalized;
    private String note;
}
