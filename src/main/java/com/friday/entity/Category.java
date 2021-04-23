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
public class Category extends BaseEntity{

    private String description;
    private Boolean enabled;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

}
