package com.friday.entity;

import com.friday.enums.InvoiceStatus;
import com.friday.enums.InvoiceType;
import com.friday.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="invoices")
public class Invoice extends  BaseEntity {
    private String invoiceNo;

    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;

    private Integer invoiceNumber;

    @Enumerated(EnumType.STRING)
    private InvoiceType invoiceType;

    private LocalDate date;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "SP_id")
    private SP sp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    private boolean enabled;

    public Invoice(String invoiceNo, InvoiceStatus invoiceStatus, Integer invoiceNumber, InvoiceType invoiceType, LocalDate date, boolean enabled) {
        this.invoiceNo = invoiceNo;
        this.invoiceStatus = invoiceStatus;
        this.invoiceNumber = invoiceNumber;
        this.invoiceType = invoiceType;
        this.date = date;
        this.enabled = enabled;
    }
    public Invoice(){}
}
