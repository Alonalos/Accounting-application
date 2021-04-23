package com.friday.enums;

public enum Status {
    ACTIVE("Active"),PASSIVE("Passive");
    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
