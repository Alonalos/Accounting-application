package com.friday.dto;

import com.friday.entity.Category;
import com.friday.entity.Company;
import com.friday.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Integer qty;
    private Integer price;
    private String unit;
    private Integer lowLimitAlert;
    private Integer tax;
    private CategoryDTO category;
    private CompanyDTO company;
    private Status productStatus;
}
