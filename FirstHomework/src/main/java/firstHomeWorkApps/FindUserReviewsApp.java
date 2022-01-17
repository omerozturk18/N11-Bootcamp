package firstHomeWorkApps;

import dto.CustomerCommentsDto;
import entityservice.CustomerEntityService;

import java.util.List;

public class FindUserReviewsApp {
    public static void main(String[] args) {
        CustomerEntityService customerEntityService =new CustomerEntityService();
       List<CustomerCommentsDto> customerComments= customerEntityService.findAllCustomerComments(1L);
        for (CustomerCommentsDto comment : customerComments) {
            System.out.println(comment);
        }
    }

}