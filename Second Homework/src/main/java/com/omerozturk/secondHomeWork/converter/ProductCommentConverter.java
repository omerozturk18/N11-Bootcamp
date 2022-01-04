package com.omerozturk.secondHomeWork.converter;


import com.omerozturk.secondHomeWork.dto.ProductCommentDto;
import com.omerozturk.secondHomeWork.dto.ProductCommentViewDto;

import com.omerozturk.secondHomeWork.entity.ProductComment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductCommentConverter {
    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);


    @Mapping(source = "productId", target = "product.id")
    @Mapping(source = "customerId", target = "customer.id")
    ProductComment convertProductCommentDtoToProductComment(ProductCommentDto productCommentDtoDto);


    @Mapping(target = "productName", source = "product.productName")
    @Mapping(target = "categoryName", source = "product.category.categoryName")
    @Mapping(target = "price", source = "product.price")
    @Mapping(target = "customerFirstName", source = "customer.firstName")
    @Mapping(target = "customerLastName", source = "customer.lastName")
    @Mapping(target = "customerEmail", source = "customer.email")
    @Mapping(target = "customerPhone", source = "customer.phone")
    ProductCommentViewDto convertProductCommentToProductCommentViewDto(ProductComment productComment);

    @Mapping(target = "productName", source = "product.productName")
    @Mapping(target = "categoryName", source = "product.category.categoryName")
    @Mapping(target = "price", source = "product.price")
    @Mapping(target = "customerFirstName", source = "customer.firstName")
    @Mapping(target = "customerLastName", source = "customer.lastName")
    @Mapping(target = "customerEmail", source = "customer.email")
    @Mapping(target = "customerPhone", source = "customer.phone")

    List<ProductCommentViewDto> convertAllProductCommentListToProductCommentViewDtoList(List<ProductComment> productCommentList);

}
