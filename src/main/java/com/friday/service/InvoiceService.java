package com.friday.service;

import com.friday.dto.CompanyDTO;
import com.friday.dto.InvoiceDTO;
import com.friday.entity.Company;
import com.friday.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    InvoiceDTO findById(Long id);

    Invoice save(InvoiceDTO dto);

    InvoiceDTO update(InvoiceDTO dto);

    void delete(Long id);

    InvoiceDTO changeStatus (InvoiceDTO dto);

    List<InvoiceDTO> showAllInvoices();
}
