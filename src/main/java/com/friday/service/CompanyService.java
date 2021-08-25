package com.friday.service;

import com.friday.dto.CompanyDTO;
import com.friday.dto.RoleDTO;
import com.friday.dto.UserDTO;
import com.friday.entity.Company;


import java.util.List;

public interface CompanyService {


    CompanyDTO save(CompanyDTO dto) throws Exception;

    CompanyDTO update(CompanyDTO dto) throws Exception;

    void delete(Long id);

    List<CompanyDTO> listAllCompanies();

    CompanyDTO findById(Long id);






}
