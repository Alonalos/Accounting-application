package com.friday.enums;

public enum InvoiceStatus {

    IN_PROCESS("In Process"),
    APPROVED("Approved");


    private final String value;

    InvoiceStatus(String value) {
        this.value = value;
    }

    public String getInvoiceStatus() {
        return value;
    }




}
