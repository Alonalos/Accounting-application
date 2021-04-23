package com.friday.service;

import com.friday.dto.CategoryDTO;
import com.friday.dto.CompanyDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> listAllCategories();

    List<CategoryDTO> listProductsCount(CategoryDTO categoryName);

    CategoryDTO save(CategoryDTO dto);

    CategoryDTO update(CategoryDTO dto);

    void delete(long id);
}
