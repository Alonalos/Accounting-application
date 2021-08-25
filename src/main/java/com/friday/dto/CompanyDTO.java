package com.friday.dto;

import com.friday.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CompanyDTO {
    private Long id;
    private String title;
    private String address1;
    private String phone;
    private String state;
    private String zip;
    private String representative;
    private String email;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate establishmentDate;

    private Status companyStatus;


}
