package com.friday.service;

import com.friday.dto.CategoryDTO;
import com.friday.dto.ProductDTO;


import java.util.List;

public interface ProductService {

    List<ProductDTO> listAllProducts();

    List<ProductDTO> listProductsCount();

    ProductDTO save(ProductDTO dto);

    ProductDTO update(ProductDTO dto);

    void delete(long id);
}

