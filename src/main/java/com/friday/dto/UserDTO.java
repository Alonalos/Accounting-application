package com.friday.dto;

import com.friday.entity.Company;
import com.friday.entity.Role;
import com.friday.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

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
    private CompanyDTO company;
    private List<RoleDTO> roles;

    public String getRolesString() {
        String rolesStr = "";
        for (RoleDTO role : roles) {
            rolesStr += role.getDescription() + " ";
        }
        return rolesStr;
    }








}
