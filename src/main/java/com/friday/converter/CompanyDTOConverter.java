package com.friday.converter;

import com.friday.dto.CompanyDTO;
import com.friday.entity.Company;
import com.friday.repository.CompanyRepository;
import com.friday.service.CompanyService;
import com.friday.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class CompanyDTOConverter implements Converter<String, CompanyDTO> {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    MapperUtil mapperUtil;

    @Override
    public CompanyDTO convert(String source) {
        Company company=companyRepository.findByEmail(source);


        return mapperUtil.convert(company,new CompanyDTO());
    }
}
