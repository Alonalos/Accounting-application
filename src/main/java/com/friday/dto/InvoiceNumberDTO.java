package com.friday.dto;

import com.friday.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InvoiceNumberDTO {
    private CompanyDTO company;
    private Integer year;
    private Integer invoiceNumber;
}
