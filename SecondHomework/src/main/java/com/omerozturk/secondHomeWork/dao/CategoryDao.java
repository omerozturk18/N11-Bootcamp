package com.omerozturk.secondHomeWork.dao;

import com.omerozturk.secondHomeWork.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Long> {

}
