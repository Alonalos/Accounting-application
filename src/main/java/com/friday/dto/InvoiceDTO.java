package com.friday.dto;

import com.friday.entity.Company;
import com.friday.entity.SP;
import com.friday.enums.InvoiceStatus;
import com.friday.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InvoiceDTO {

    private String invoiceNo;
    private InvoiceStatus invoiceStatus;
    private Integer invoiceNumber;
    private InvoiceType invoiceType;
    private LocalDate date;
    private SP sp;
    private Company company;
    private Long id;


}
