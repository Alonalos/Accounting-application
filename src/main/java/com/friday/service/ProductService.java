package com.friday.service;

import com.friday.dto.CategoryDTO;
import com.friday.dto.ProductDTO;
import com.friday.entity.Category;


import java.util.List;

public interface ProductService {

    ProductDTO save(ProductDTO dto);

    ProductDTO update(ProductDTO dto) throws Exception;

    void delete(long id);
}

