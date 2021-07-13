package com.friday.entity;

import com.friday.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="products")
public class Product extends BaseEntity  {
    private String name;
    private String description;
    private Integer qty;
    private Integer price;

    private String unit;
    private Integer lowLimitAlert;
    private Integer tax;
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public Product(String name, String description, Integer qty, Integer price, String unit, Integer lowLimitAlert, Integer tax, boolean enabled, Status status) {
        this.name = name;
        this.description = description;
        this.qty = qty;
        this.price = price;
        this.unit = unit;
        this.lowLimitAlert = lowLimitAlert;
        this.tax = tax;
        this.enabled = enabled;
        this.status = status;
    }

    public Product(){}
}
