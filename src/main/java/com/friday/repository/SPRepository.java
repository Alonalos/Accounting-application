package com.friday.repository;

import com.friday.entity.Company;
import com.friday.entity.SP;

import com.friday.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SPRepository extends JpaRepository<SP,Long> {

    List<SP> findAllByStatus(Status status);
    SP findByCompany(Company company);
}
