package com.omerozturk.secondHomeWork.controller;

import com.omerozturk.secondHomeWork.converter.ProductCommentConverter;
import com.omerozturk.secondHomeWork.dto.CountOfProductCommentsDto;
import com.omerozturk.secondHomeWork.dto.ProductCommentDto;
import com.omerozturk.secondHomeWork.dto.ProductCommentViewDto;
import com.omerozturk.secondHomeWork.entity.ProductComment;
import com.omerozturk.secondHomeWork.exception.CustomerNotFoundException;
import com.omerozturk.secondHomeWork.exception.ProductCommentNotFoundException;
import com.omerozturk.secondHomeWork.service.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ProductComment findById(@PathVariable Long id){

        ProductComment productComment = productCommentEntityService.findById(id);

        return productComment;
    }

    @PostMapping("")
    public ProductCommentViewDto save(@RequestBody ProductCommentDto productCommentDto){

        ProductComment productComment = ProductCommentConverter.INSTANCE.convertProductCommentDtoToProductComment(productCommentDto);
        //TODO: Check it
        if (productComment.getCustomer() != null && productComment.getCustomer().getId() == null){
            productComment.setCustomer(null);
        }
        if (productComment.getProduct() != null && productComment.getProduct().getId() == null){
            productComment.setProduct(null);
        }
        productComment = productCommentEntityService.save(productComment);
        ProductCommentViewDto ProductCommentViewDtoResult = ProductCommentConverter.INSTANCE.convertProductCommentToProductCommentViewDto(productComment);
        return ProductCommentViewDtoResult;
    }

    @PutMapping("")
    public ProductCommentViewDto update(@RequestBody ProductCommentDto productCommentDto){
        ProductComment productComment = ProductCommentConverter.INSTANCE.convertProductCommentDtoToProductComment(productCommentDto);
        //TODO: Check it
        if (productComment.getCustomer() != null && productComment.getCustomer().getId() == null){
            productComment.setCustomer(null);
        }
        if (productComment.getProduct() != null && productComment.getProduct().getId() == null){
            productComment.setProduct(null);
        }
        productComment = productCommentEntityService.save(productComment);
        ProductCommentViewDto ProductCommentViewDtoResult = ProductCommentConverter.INSTANCE.convertProductCommentToProductCommentViewDto(productComment);
        return ProductCommentViewDtoResult;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        productCommentEntityService.deleteById(id);
    }

    @GetMapping("/products/{id}")
    public List<ProductCommentViewDto> findAllProductCommentByProductId(@PathVariable Long id){
        List<ProductCommentViewDto> productCommentViewDtoList = productCommentEntityService.findAllProductCommentByProductId(id);
        if (productCommentViewDtoList.size()==0) throw new ProductCommentNotFoundException("Product's Product Comment not found");

        return productCommentViewDtoList;
    }
    @GetMapping("/customers/{id}")
    public List<ProductCommentViewDto> findAllByProductCommentByCustomerId(@PathVariable Long id){
        List<ProductComment> productCommentList = productCommentEntityService.findAllByProductCommentCustomerId(id);
        if (productCommentList.size()==0) throw new ProductCommentNotFoundException("User's Product Comment not found");
        List<ProductCommentViewDto> productCommentViewDtoResult = ProductCommentConverter.INSTANCE.convertAllProductCommentListToProductCommentViewDtoList(productCommentList);
        return productCommentViewDtoResult;
    }

}
