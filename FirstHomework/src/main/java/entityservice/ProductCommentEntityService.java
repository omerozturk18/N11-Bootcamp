package entityservice;

import dao.ProductCommentDao;
import dto.ProductCommentDto;


import java.util.List;

public class ProductCommentEntityService {
    private ProductCommentDao productCommentDao;
    public ProductCommentEntityService() {
        productCommentDao =new ProductCommentDao();
    }
    public List<ProductCommentDto> findAllProductCommentByProductId(Long id){
        return productCommentDao.findAllProductCommentByProductId(id);
    }
}
