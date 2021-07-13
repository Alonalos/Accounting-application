package com.friday.entity;

import com.friday.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


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
    private boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Company company;

    public SP(String companyName, String phone, String email, Status status, String type, String zipCode, String address, String state, boolean enabled) {
        this.companyName = companyName;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.type = type;
        this.zipCode = zipCode;
        this.address = address;
        this.state = state;
        this.enabled = enabled;
    }

    public SP(){}
}
