package com.friday.repository;

import com.friday.entity.InvoiceNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceNumberRepository extends JpaRepository<InvoiceNumber,Long> {

}