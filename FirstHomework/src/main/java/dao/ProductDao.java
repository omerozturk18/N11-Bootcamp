package dao;

import base.BaseDao;
import dto.CountOfProductCommentsDto;
import dto.ProductDetailDto;
import entity.Product;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao extends BaseDao {

    public List<Product> findAll(){

        String sql = "select product from Product product";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public Product findById(Long id){

        String sql = "select product from Product product where product.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (Product) query.uniqueResult();
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){

        String sql = "select product from Product product where 1=1 ";

        if (priceGe != null){
            sql = sql + " and product.price >= :priceGe ";
        }

        if (priceLe != null){
            sql = sql + " and product.price <= :priceLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("priceLe", priceLe);
        query.setParameter("priceGe", priceGe);

        return query.list();
    }

    public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe){

        String sql = "select product from Product product where 1=1 ";

        if (priceGe != null && priceLe != null){
            sql = sql + " and product.price between :priceGe and :priceLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("priceLe", priceLe);
        query.setParameter("priceGe", priceGe);

        return query.list();
    }

    public List<Product> findAllProductByCategoryBreaking(Long breaking) {

        String sql = " select product from Product product " +
                " left join Category category  on product.category.id = category.id " +
                " where category.breaking = :breaking ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("breaking", breaking);

        return query.list();
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryBreaking(Long breaking) {

        String sql = " select " +
                " new dto.ProductDetailDto( product.productName, category.categoryName, product.price ) " +
                " from Product product " +
                " left join Category category  on product.category.id = category.id " +
                " where category.breaking = :breaking ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("breaking", breaking);

        return query.list();
    }
        public List<CountOfProductCommentsDto> findAllCountOfProductComments() {

        String sql = " select " +
                " new dto.CountOfProductCommentsDto( product.id, product.productName, product.price,count(productComment)) " +
                " from Product product " +
                " left join ProductComment productComment  on product.id = productComment.product.id " +
                "group by product.id";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

}