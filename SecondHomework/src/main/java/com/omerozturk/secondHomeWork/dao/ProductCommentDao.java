package com.omerozturk.secondHomeWork.dao;



import com.omerozturk.secondHomeWork.dto.CountOfProductCommentsDto;
import com.omerozturk.secondHomeWork.dto.ProductCommentViewDto;
import com.omerozturk.secondHomeWork.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductCommentDao extends JpaRepository<ProductComment,Long> {
    @Query(" select " +
            " new com.omerozturk.secondHomeWork.dto.ProductCommentViewDto( productComment.id,product.productName, category.categoryName, product.price" +
            ",customer.firstName,customer.lastName,customer.email,customer.phone,productComment.comment,productComment.commentDate ) " +
            " from ProductComment productComment " +
            "left join Customer customer  on   productComment.customer.id= customer.id " +
            "left join Product product  on  productComment.product.id =product.id " +
            "left join Category category  on  productComment.product.id =category.id " +
            " where productComment.product.id = :productId ")
    List<ProductCommentViewDto> findAllByProductCommentViewDtoById(Long productId);

    List<ProductComment> findAllByCustomer_Id(Long customerId);
}
