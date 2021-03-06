package com.friday.enums;

public enum CompanyType {
    VENDOR("Vendor"),CUSTOMER("Customer"),VENDOR_CUSTOMER("Vendor_Customer");

    private final String value;

    CompanyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
