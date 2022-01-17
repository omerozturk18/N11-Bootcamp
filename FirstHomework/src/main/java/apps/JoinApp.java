package apps;

import entity.Product;
import entityservice.ProductEntityService;

import java.util.List;

public class JoinApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<Product> productList = service.findAllProductByCategoryBreaking(3L);

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}