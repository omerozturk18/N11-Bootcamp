package dao;

import base.BaseDao;
import dto.ProductCommentDto;

import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {
    public List<ProductCommentDto> findAllProductCommentByProductId(Long id){
        String sql = " select " +
                " new dto.ProductCommentDto( product.productName, category.categoryName, product.price" +
                ",customer.firstName,customer.lastName,customer.email,customer.phone,productComment.comment,productComment.commentDate ) " +
                " from ProductComment productComment " +
                "left join Customer customer  on   productComment.customer.id= customer.id " +
                "left join Product product  on  productComment.product.id =product.id " +
                "left join Category category  on  productComment.product.id =category.id " +
                " where productComment.product.id = :givenId ";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return query.list();
    }
}
