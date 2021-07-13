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
    private boolean enabled;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;

    @Enumerated(EnumType.STRING)
    private Status status;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
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

    public User() {
    }

    public User(Long id, LocalDateTime insertDateTime, String insertUserId, LocalDateTime lastUpdateDateTime,
                String lastUpdateUserId, String firstName, String lastName, String username, String email, boolean enabled, String phone,
                List<Role> roles,String password) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.roles = roles;
    }
    public void addRole(Role role) {
        roles.add(role);
    }
    public void removeRole(Role role) {
        roles.remove(role);
    }





    public User(String firstName, String lastName,  String email, boolean enabled, String phone,
                String password,Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.company = company;
    }

}


