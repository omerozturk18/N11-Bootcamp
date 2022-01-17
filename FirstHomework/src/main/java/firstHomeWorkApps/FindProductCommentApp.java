package firstHomeWorkApps;

import dto.ProductCommentDto;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindProductCommentApp {
    public static void main(String[] args) {

        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentDto> productCommentsList = service.findAllProductCommentByProductId(1L);

        for (ProductCommentDto comment : productCommentsList) {
            System.out.println(comment);
        }
    }
}
