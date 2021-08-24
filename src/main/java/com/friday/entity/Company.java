package com.friday.entity;

import com.friday.enums.InvoiceType;
import com.friday.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name="companies")
public class Company extends  BaseEntity {
    private String title;
    private String address1;
    private String phone;
    private String state;
    private String zip;
    private String representative;

    @Column(unique=true)
    private String email;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate establishmentDate;



    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Company(String title, String address1,String phone,  String state, String zip, String representative, String email, LocalDate establishmentDate, boolean enabled, Status status) {
        this.title = title;
        this.address1 = address1;
        this.phone=phone;
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
