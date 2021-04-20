package com.friday.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="SP")
public class SP extends BaseEntity {
    private String companyName;
    private String phone;
    private String email;

    private String type;
    private String zipCode;
    private String address;
    private String state;
    private Boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Company company;


}
