package com.omerozturk.thirdhomeworkomerozturk18.dataAccess.repository;

import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface ProductCommentDao extends MongoRepository<ProductComment,String> {
    List<ProductComment> findAllByCustomerId(String customerId);
}
