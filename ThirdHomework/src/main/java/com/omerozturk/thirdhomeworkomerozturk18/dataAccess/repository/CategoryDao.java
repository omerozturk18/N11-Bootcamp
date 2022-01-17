package com.omerozturk.thirdhomeworkomerozturk18.dataAccess.repository;

import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CategoryDao extends MongoRepository<Category, String> {

}
