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
@Table(name="sp")
public class SP extends BaseEntity {
    private String companyName;
    private String phone;
    @Column(unique=true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String type;
    private String zipCode;
    private String address;
    private String state;
    private Boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Company company;


}
