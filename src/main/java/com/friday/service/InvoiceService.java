package com.friday.service;

import com.friday.dto.CompanyDTO;
import com.friday.dto.InvoiceDTO;
import com.friday.entity.Company;
import com.friday.entity.Invoice;
import com.friday.enums.InvoiceStatus;
import com.friday.enums.InvoiceType;

import java.util.List;

public interface InvoiceService {

    InvoiceDTO save(InvoiceDTO dto);

    InvoiceDTO update(InvoiceDTO dto) throws Exception;

    void delete(Long id);

    InvoiceDTO changeStatus (InvoiceDTO dto) throws Exception;

    List<InvoiceDTO> findByCompany(Company company);
    List<InvoiceDTO> findByType(InvoiceType type);

    List<InvoiceDTO>findByStatus(InvoiceStatus status);
}
