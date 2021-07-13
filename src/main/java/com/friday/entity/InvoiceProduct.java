package com.friday.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Getter
@Setter
@Entity
@Table(name="invoiceProducts")
public class InvoiceProduct extends  BaseEntity{

    private BigDecimal unitPrice;
    private Integer qty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    public InvoiceProduct(BigDecimal unitPrice, Integer qty) {
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
    public InvoiceProduct(){}
}
