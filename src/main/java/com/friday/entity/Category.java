package com.friday.entity;


import com.friday.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@Entity
@Table(name="categories")
public class Category extends BaseEntity{

    private String description;
    private boolean enabled;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public Category(String description, boolean enabled, Status status) {
        this.description = description;
        this.enabled = enabled;
        this.status = status;
    }

    public Category(){}
}
