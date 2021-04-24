package com.friday.implementation;

import com.friday.dto.InvoiceDTO;
import com.friday.dto.SPDTO;
import com.friday.entity.Company;
import com.friday.entity.Invoice;
import com.friday.entity.SP;
import com.friday.repository.SPRepository;
import com.friday.service.SPService;
import com.friday.util.MapperUtil;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SPServiceImpl  {

    private MapperUtil mapperUtil;
    private SPRepository spRepository;

    public SPServiceImpl(MapperUtil mapperUtil, SPRepository spRepository) {
        this.mapperUtil = mapperUtil;
        this.spRepository = spRepository;
    }


}
