package com.friday.implementation;

import com.friday.dto.CompanyDTO;
import com.friday.dto.InvoiceDTO;
import com.friday.entity.Company;
import com.friday.entity.Invoice;
import com.friday.enums.InvoiceStatus;
import com.friday.enums.InvoiceType;
import com.friday.repository.InvoiceRepository;
import com.friday.service.InvoiceService;
import com.friday.util.MapperUtil;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class InvoiceServiceImpl implements InvoiceService {

    private MapperUtil mapperUtil;
    private InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(MapperUtil mapperUtil, InvoiceRepository invoiceRepository) {
        this.mapperUtil = mapperUtil;
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public InvoiceDTO save(InvoiceDTO dto) {

        //dto.setInvoiceStatus(InvoiceStatus.IN_PROCESS);
        dto.setDate(LocalDate.now());
        Invoice invoice=mapperUtil.convert(dto,new Invoice());
        Invoice save=invoiceRepository.save(invoice);

        return mapperUtil.convert(save, new InvoiceDTO());

    }

    @Override
    public InvoiceDTO update(InvoiceDTO dto) throws Exception {

        Invoice invoice=invoiceRepository.findById(dto.getId()).orElseThrow(()->new Exception("Invoice does not exist"));
        Invoice convertedInvoice= mapperUtil.convert(dto, new Invoice());
        Invoice updatedInvoice= invoiceRepository.save(convertedInvoice);

        return mapperUtil.convert(updatedInvoice, new InvoiceDTO());
    }

    @Override
    public void delete(Long id) {

        Optional<Invoice> invoice=invoiceRepository.findById(id);
        if(invoice.isPresent()) {
            invoice.get().setEnabled(false);
            invoice.get().setInvoiceStatus(InvoiceStatus.DELETED);
            invoiceRepository.save(invoice.get());
       }

    }

    @Override
    public InvoiceDTO changeStatus(InvoiceDTO dto) throws Exception {

        Invoice invoice=invoiceRepository.findById(dto.getId()).orElseThrow(()->new Exception("Invoice does not exist"));
        invoice.setInvoiceStatus(dto.getInvoiceStatus());
        Invoice save=invoiceRepository.save(invoice);
        return mapperUtil.convert(save, new InvoiceDTO());

    }

    @Override
    public List<InvoiceDTO> findByCompany(Company company) {
        List<Invoice> invoices=invoiceRepository.findAllByCompany(company);

        return invoices.stream().map(obj->mapperUtil.convert(obj, new InvoiceDTO())).collect(Collectors.toList());
    }


    @Override
    public List<InvoiceDTO> findByType(InvoiceType type) {
        List<Invoice> invoices=invoiceRepository.findAllByInvoiceType(type);

        return invoices.stream().map(obj->mapperUtil.convert(obj, new InvoiceDTO())).collect(Collectors.toList());

    }

    @Override
    public List<InvoiceDTO> findByStatus(InvoiceStatus status) {
        List<Invoice> invoices=invoiceRepository.findAllByInvoiceStatus(status);

        return invoices.stream().map(obj->mapperUtil.convert(obj, new InvoiceDTO())).collect(Collectors.toList());
    }
}
