package com.friday.service;

import com.friday.dto.CompanyDTO;
import com.friday.entity.Company;


import java.util.List;

public interface CompanyService {

    Company findByCompanyName(String companyName);

    Company save(CompanyDTO dto);

    CompanyDTO update(CompanyDTO dto);

    void delete(Long id);

    CompanyDTO deactivate(Long id);


    List<CompanyDTO> listAllCompanies();

}
