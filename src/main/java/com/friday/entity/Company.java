package com.friday.entity;

import com.friday.enums.InvoiceType;
import com.friday.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="companies")
public class Company extends  BaseEntity {
    private String title;
    private String address1;
    private String address2;
    private String state;
    private String zip;
    private String representative;

    @Column(unique=true)
    private String email;

    private LocalDate establishmentDate;
    private Boolean enabled;

    @Enumerated(EnumType.STRING)
    private Status status;


}
