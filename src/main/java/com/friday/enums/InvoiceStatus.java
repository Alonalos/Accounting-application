package com.friday.enums;

public enum InvoiceStatus {

    IN_PROCESS("In Process"),
    DRAFT("Draft"),
    PAID("Paid"),
    REJECTED("Rejected"),
    VOIDED("Voided"),
    PENDING_REVIEW("PendingReview");

    private final String value;

    InvoiceStatus(String value) {
        this.value = value;
    }

    public String getInvoiceStatus() {
        return value;
    }




}
