package com.friday.enums;

public enum CompanyType {
    VENDOR("Vendor"),CUSTOMER("Customer"),BOTH("Both");

    private final String value;

    CompanyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
