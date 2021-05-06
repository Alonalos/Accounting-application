package com.friday.entity;

import com.friday.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
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
    private Boolean enabled;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;




}
