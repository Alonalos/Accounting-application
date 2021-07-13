package com.friday.dto;

import com.friday.entity.Company;
import com.friday.enums.CompanyType;
import com.friday.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SPDTO {
    private Long id;
    private String companyName;
    private String phone;
    private String email;
    private CompanyType type;
    private String zipCode;
    private String address;
    private String state;
    private Status status;

    private CompanyDTO company;
}
