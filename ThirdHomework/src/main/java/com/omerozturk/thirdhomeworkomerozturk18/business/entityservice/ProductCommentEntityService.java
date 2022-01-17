package com.omerozturk.thirdhomeworkomerozturk18.business.entityservice;



import com.omerozturk.thirdhomeworkomerozturk18.dataAccess.repository.ProductCommentDao;
import com.omerozturk.thirdhomeworkomerozturk18.entities.dto.ProductCommentViewDto;
import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentDao productCommentDao;

    public List<ProductComment> findAll(){
        return productCommentDao.findAll();
    }

    public ProductComment findById(String id){
        Optional<ProductComment> optionalProductComment = productCommentDao.findById(id);
        ProductComment productComment = null;
        if (optionalProductComment.isPresent()){
            productComment = optionalProductComment.get();
        }
        return productComment;
    }

    public ProductComment save(ProductComment productComment){
        return productCommentDao.save(productComment);
    }
    public void delete(ProductComment category){
        productCommentDao.delete(category);
    }

    public void deleteById(String id){
        productCommentDao.deleteById(id);
    }

    public List<ProductComment> findAllByProductCommentCustomerId(String id){
        return productCommentDao.findAllByCustomerId(id);
    }


}
