package com.friday.repository;

import com.friday.entity.Company;
import com.friday.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

 Company findByEmail(String email);



}
