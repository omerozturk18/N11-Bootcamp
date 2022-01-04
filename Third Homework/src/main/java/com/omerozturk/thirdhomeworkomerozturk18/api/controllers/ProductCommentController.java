package com.omerozturk.thirdhomeworkomerozturk18.api.controllers;

import com.omerozturk.thirdhomeworkomerozturk18.business.converter.ProductCommentConverter;
import com.omerozturk.thirdhomeworkomerozturk18.entities.dto.ProductCommentDto;
import com.omerozturk.thirdhomeworkomerozturk18.entities.dto.ProductCommentViewDto;
import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.ProductComment;
import com.omerozturk.thirdhomeworkomerozturk18.business.exception.ProductCommentNotFoundException;
import com.omerozturk.thirdhomeworkomerozturk18.business.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productComments")
public class ProductCommentController {

    @Autowired
    ProductCommentEntityService productCommentEntityService;

    @GetMapping("")
    public List<ProductCommentViewDto> findAll(){

        List<ProductComment> productCommentList = productCommentEntityService.findAll();

        List<ProductCommentViewDto> ProductCommentViewDtoList = ProductCommentConverter.INSTANCE.convertAllProductCommentListToProductCommentViewDtoList(productCommentList);

        return ProductCommentViewDtoList;
    }

    @GetMapping("/{id}")
    public ProductComment findById(@PathVariable String id){

        ProductComment productComment = productCommentEntityService.findById(id);

        return productComment;
    }

    @PostMapping("")
    public ProductCommentViewDto save(@RequestBody ProductCommentDto productCommentDto){

        ProductComment productComment = ProductCommentConverter.INSTANCE.convertProductCommentDtoToProductComment(productCommentDto);
        productComment = productCommentEntityService.save(productComment);
        ProductCommentViewDto ProductCommentViewDtoResult = ProductCommentConverter.INSTANCE.convertProductCommentToProductCommentViewDto(productComment);
        return ProductCommentViewDtoResult;
    }

    @PutMapping("")
    public ProductCommentViewDto update(@RequestBody ProductCommentDto productCommentDto){
        ProductComment productComment = ProductCommentConverter.INSTANCE.convertProductCommentDtoToProductComment(productCommentDto);
        productComment = productCommentEntityService.save(productComment);
        ProductCommentViewDto ProductCommentViewDtoResult = ProductCommentConverter.INSTANCE.convertProductCommentToProductCommentViewDto(productComment);
        return ProductCommentViewDtoResult;
    }

    @DeleteMapping("/{id}")
    public void delete(String id){
        productCommentEntityService.deleteById(id);
    }

    @GetMapping("/customers/{id}")
    public List<ProductCommentViewDto> findAllByProductCommentByCustomerId(@PathVariable String id){
        List<ProductComment> productCommentList = productCommentEntityService.findAllByProductCommentCustomerId(id);
        if (productCommentList.size()==0) throw new ProductCommentNotFoundException("User's Product Comment not found");
        List<ProductCommentViewDto> productCommentViewDtoResult = ProductCommentConverter.INSTANCE.convertAllProductCommentListToProductCommentViewDtoList(productCommentList);
        return productCommentViewDtoResult;
    }

}
