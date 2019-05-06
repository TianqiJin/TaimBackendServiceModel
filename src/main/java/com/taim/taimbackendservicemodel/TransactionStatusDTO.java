package com.taim.taimbackendservicemodel;

public enum  TransactionStatusDTO {
    CREATED_NOT_SUBMITTED("Non Submitted"),
    SUBMITTED("Submitted");

    private String value;

    TransactionStatusDTO(String vvalue){
        this.value = vvalue;
    }

    public String getValue() {
        return value;
    }
}
