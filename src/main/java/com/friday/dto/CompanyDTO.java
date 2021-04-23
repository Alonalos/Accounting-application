package com.friday.dto;

import com.friday.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CompanyDTO {
    private Long id;
    private String title;
    private String address1;
    private String address2;
    private String state;
    private String zip;
    private String representative;
    private String email;
    private LocalDate establishmentDate;
    private Status companyStatus;
}