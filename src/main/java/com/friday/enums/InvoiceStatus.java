package com.friday.enums;

public enum InvoiceStatus {

    INPROGRESS("In Progress"),
    APPROVED("Approved"),
    DELETED("Deleted");


    private final String value;

    InvoiceStatus(String value) {
        this.value = value;
    }

    public String getInvoiceStatus() {
        return value;
    }




}
