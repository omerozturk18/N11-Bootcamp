package com.omerozturk.secondHomeWork.service.entityservice;



import com.omerozturk.secondHomeWork.dao.ProductCommentDao;
import com.omerozturk.secondHomeWork.dto.CountOfProductCommentsDto;
import com.omerozturk.secondHomeWork.dto.ProductCommentViewDto;
import com.omerozturk.secondHomeWork.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentDao productCommentDao;

    public List<ProductComment> findAll(){
        return productCommentDao.findAll();
    }

    public ProductComment findById(Long id){
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

    public void deleteById(Long id){
        productCommentDao.deleteById(id);
    }

    public List<ProductCommentViewDto> findAllProductCommentByProductId(Long id){
        return productCommentDao.findAllByProductCommentViewDtoById(id);
    }
    public List<ProductComment> findAllByProductCommentCustomerId(Long id){
        return productCommentDao.findAllByCustomer_Id(id);
    }


}
