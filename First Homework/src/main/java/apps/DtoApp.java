package apps;

import dto.ProductDetailDto;
import entityservice.ProductEntityService;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<ProductDetailDto> productList = service.findAllProductDetailDtoByCategoryBreaking(3L);

        for (ProductDetailDto productDetail : productList) {
            System.out.println(productDetail);
        }
    }
}