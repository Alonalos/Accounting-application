package com.friday.implementation;

import com.friday.dto.CompanyDTO;
import com.friday.dto.InvoiceDTO;
import com.friday.entity.Company;
import com.friday.entity.Invoice;
import com.friday.enums.Status;
import com.friday.repository.CompanyRepository;
import com.friday.service.CompanyService;
import com.friday.util.MapperUtil;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CompanyServiceImpl implements CompanyService {

    private MapperUtil mapperUtil;
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(MapperUtil mapperUtil, CompanyRepository companyRepository) {
        this.mapperUtil = mapperUtil;
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyDTO save(CompanyDTO dto) throws Exception {

        Company company=mapperUtil.convert(dto, new Company());
        Company save=companyRepository.save(company);
        return mapperUtil.convert(save, new CompanyDTO());

    }

    @Override
    public CompanyDTO update(CompanyDTO dto) throws Exception {

        Company company = companyRepository.findById(dto.getId()).orElseThrow(()->new Exception("Company doesn't exist!"));

        Company convertedCompany = mapperUtil.convert(dto, new Company());
        Company updatedCompany = companyRepository.save(convertedCompany);

        return mapperUtil.convert(companyRepository.findById(dto.getId()), new CompanyDTO());

    }


    @Override
    public void delete(Long id) {
        Optional <Company> company= companyRepository.findById(id);

        if(company.isPresent()) {
            company.get().setEnabled(false);
            company.get().setStatus(Status.PASSIVE);
            companyRepository.save(company.get());
        }

    }


    @Override
    public List<CompanyDTO> listAllCompanies() {
        List<Company> list = companyRepository.findAll();
        return list.stream().map(obj->mapperUtil.convert(obj, new CompanyDTO())).collect(Collectors.toList());
    }




}
