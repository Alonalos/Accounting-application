package com.friday.dto;

import com.friday.entity.Invoice;
import com.friday.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InvoiceProductDTO {
    private BigDecimal unitPrice;
    private Integer qty;
    private ProductDTO product;
    private InvoiceDTO invoice;
}
