package com.friday.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Role extends BaseEntity{

    private String name;
    private Boolean enabled;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy ="roleList")
    private List<User> userList = new ArrayList<>();

}
