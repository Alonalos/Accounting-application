package com.friday.repository;

import com.friday.entity.Company;
import com.friday.entity.Invoice;
import com.friday.enums.InvoiceStatus;
import com.friday.enums.InvoiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

    List<Invoice> findAllByInvoiceStatus(InvoiceStatus status);

    List<Invoice> findAllByInvoiceType (InvoiceType type);

    List<Invoice> findAllByCompany(Company company);

}
