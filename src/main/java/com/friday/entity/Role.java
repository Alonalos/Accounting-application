package com.friday.entity;

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
@Table(name="roles")
public class Role extends BaseEntity{

    private String description;


    @ManyToMany(mappedBy = "roles")
    private List <User> users=new ArrayList<>();


    public Role(String description) {
        this.description = description;
    }

public Role(){}


}
