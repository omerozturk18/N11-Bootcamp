package apps;

import entity.Product;
import entityservice.ProductEntityService;
public class FindByIdApp {

    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        Product urun = service.findById(1L);

        System.out.println(urun);
    }
}