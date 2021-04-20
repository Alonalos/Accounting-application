package com.friday.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category extends BaseEntity{

    private String description;
    private Boolean enabled;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

}
