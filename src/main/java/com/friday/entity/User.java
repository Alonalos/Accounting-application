package com.friday.entity;

import com.friday.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="users")
public class User extends BaseEntity {
    @Column(unique=true)
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Boolean enabled;
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Enumerated(EnumType.STRING)
    private Status status;


    @ManyToMany
    @JoinTable(name = "userRole",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List <Role> roles= new ArrayList<>();

    public User(String email, String firstName, String lastName, String password, Boolean enabled, String phone, Company company, Status status) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.company = company;
        this.status = status;
    }
}


