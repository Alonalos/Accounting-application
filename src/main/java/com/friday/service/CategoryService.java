package com.friday.service;

import com.friday.dto.CategoryDTO;


import java.util.List;

public interface CategoryService {
    List<CategoryDTO> listAllCategories();

    Integer listProductsCount();

    CategoryDTO save(CategoryDTO dto);

    CategoryDTO update(CategoryDTO dto);

    void delete(long id);
}
