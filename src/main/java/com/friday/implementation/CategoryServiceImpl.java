package com.friday.implementation;

import com.friday.dto.CategoryDTO;
import com.friday.entity.Category;
import com.friday.repository.CategoryRepository;
import com.friday.service.CategoryService;
import com.friday.util.MapperUtil;
import org.springframework.stereotype.Service;



@Service
public class CategoryServiceImpl  {

//    private MapperUtil mapperUtil;
//    private CategoryRepository categoryRepository;
//
//    public CategoryServiceImpl(MapperUtil mapperUtil, CategoryRepository categoryRepository) {
//        this.mapperUtil = mapperUtil;
//        this.categoryRepository = categoryRepository;
//    }

//    @Override
//    public List<CategoryDTO> listAllCategories() {
//        List<Category>categories=categoryRepository.findAll();
//        return categories.stream().map(obj->mapperUtil.convertToDTO(obj, new CategoryDTO())).collect(Collectors.toList());
//
//
//    }


}
