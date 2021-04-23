package com.friday.dto;

import com.friday.entity.Company;
import com.friday.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phone;
    private Status userStatus;
    private RoleDTO role;
    private Company company;
}
