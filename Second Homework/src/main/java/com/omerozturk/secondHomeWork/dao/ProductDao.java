package com.omerozturk.secondHomeWork.dao;


import com.omerozturk.secondHomeWork.dto.CountOfProductCommentsDto;
import com.omerozturk.secondHomeWork.dto.ProductDetailDto;
import com.omerozturk.secondHomeWork.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

    List<Product> getAllByCategory_Id(Long id);
    List<Product> findAllByPriceBetween(BigDecimal priceGe, BigDecimal priceLe);
    List<Product> findAllByCategory_Breaking(Long breaking);
    @Query(" select " +
            " new com.omerozturk.secondHomeWork.dto.CountOfProductCommentsDto( product.id, product.productName, product.price,count(productComment)) " +
            " from Product product " +
            " left join ProductComment productComment  on product.id = productComment.product.id " +
            "group by product.id")
    List<CountOfProductCommentsDto> findAllCountOfProductComments();

}