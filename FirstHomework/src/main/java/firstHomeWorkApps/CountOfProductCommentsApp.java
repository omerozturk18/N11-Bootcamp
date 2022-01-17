package firstHomeWorkApps;

import dto.CountOfProductCommentsDto;
import entityservice.ProductEntityService;

import java.util.List;

public class CountOfProductCommentsApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<CountOfProductCommentsDto> productCommentsCount= service.findAllCountOfProductComments();

        for (CountOfProductCommentsDto product : productCommentsCount) {
            System.out.println(product);
        }
    }
}
