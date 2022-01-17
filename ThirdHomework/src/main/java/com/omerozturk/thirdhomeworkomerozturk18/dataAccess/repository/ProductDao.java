package com.omerozturk.thirdhomeworkomerozturk18.dataAccess.repository;

import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductDao extends MongoRepository<Product, String> {

    List<Product> getAllByCategoryId(String id);
    List<Product> findAllByPriceBetween(BigDecimal priceGe, BigDecimal priceLe);

}