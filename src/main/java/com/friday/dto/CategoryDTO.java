package com.friday.dto;

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
public class CategoryDTO {
    private Long id;
    private String description;
    private Company company;
    private Status categoryStatus;

}
