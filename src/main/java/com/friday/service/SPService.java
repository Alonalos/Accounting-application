package com.friday.service;

import com.friday.dto.CompanyDTO;
import com.friday.dto.SPDTO;
import com.friday.entity.Company;
import com.friday.entity.SP;

import java.util.List;

public interface SPService {

    SP findByCompanyName(String companyName);

    SP save(SPDTO dto);

    SPDTO update(SPDTO dto);

    void delete(Long id);

    SPDTO deactivate(Long id);


    List<SPDTO> listAllSP();
}
