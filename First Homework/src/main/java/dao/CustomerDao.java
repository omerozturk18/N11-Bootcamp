package dao;

import base.BaseDao;
import dto.CustomerCommentsDto;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDao extends BaseDao {
    public List<CustomerCommentsDto> findAllCustomerComments(Long id){
        String sql = " select " +
                " new dto.CustomerCommentsDto( customer.id,product.productName, customer.firstName,productComment.comment,productComment.commentDate ) " +
                " from Customer customer " +
                "left join ProductComment productComment  on  customer.id = productComment.customer.id " +
                "left join Product product  on  productComment.product.id =product.id " +
                " where customer.id = :givenId ";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return query.list();
    }
}
