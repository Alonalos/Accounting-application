package com.friday.entity;

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
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Company(String title, String address1, String address2, String state, String zip, String representative, String email, LocalDate establishmentDate, boolean enabled, Status status) {
        this.title = title;
        this.address1 = address1;
        this.address2 = address2;
        this.state = state;
        this.zip = zip;
        this.representative = representative;
        this.email = email;
        this.establishmentDate = establishmentDate;
        this.enabled = enabled;
        this.status = status;
    }
    public Company(){}
}
