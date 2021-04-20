package com.friday.enums;

public enum InvoiceType {

    SALES("Sales"),PURCHASES("Purchases");
    private final String value;

    InvoiceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
