package com.omerozturk.secondHomeWork.converter;


import com.omerozturk.secondHomeWork.dto.CategoryDto;
import com.omerozturk.secondHomeWork.entity.Category;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryConverter {

    CategoryConverter INSTANCE = Mappers.getMapper(CategoryConverter.class);

    @Mapping(target = "topCategoryId", source = "topCategory.id")
    CategoryDto convertCategoryToCategoryDto(Category category);

    @Mapping(target = "topCategoryId", source = "topCategory.id")
    List<CategoryDto> convertAllCategoryListToCategoryDtoList(List<Category> categoryList);

//    @Mapping(target = "ustCategory.id", source = "ustCategoryId", expression = "java(null))
//    @Mapping(target = "ustCategory.id", source = "ustCategoryId", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)

    //    @Mapping(target = "ustCategory.id", expression = "java(categoryDto.getUstCategoryId() == null ? null : " +
//            "categoryDto.getUstCategoryId())")
    Category convertCategoryDtoToCategory(CategoryDto categoryDto);
}
