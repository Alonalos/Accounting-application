package com.friday.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Role extends BaseEntity{

    private String name;
    private Boolean enabled;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "roles")
    private List <User> users;

}
