package com.friday.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="invoiceNumbers")
public class InvoiceNumber extends BaseEntity{


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")//many invoiceNumbers can belong to 1 company
    private Company company;

    private Integer year;
    private Integer invoiceNumber;

}
