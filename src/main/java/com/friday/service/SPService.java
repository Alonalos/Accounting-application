package com.friday.service;

import com.friday.dto.CompanyDTO;
import com.friday.dto.SPDTO;
import com.friday.entity.Company;
import com.friday.entity.SP;

import java.util.List;

public interface SPService {

    SP findByCompany(Company company);

    SP save(SPDTO dto);

    SPDTO update(SPDTO dto);

    void delete(Long id);





}
