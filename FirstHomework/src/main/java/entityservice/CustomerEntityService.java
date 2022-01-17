package entityservice;



import dao.CustomerDao;
import dto.CustomerCommentsDto;

import java.util.List;

public class CustomerEntityService {
    private CustomerDao customerDao;
    public CustomerEntityService() {
        customerDao =new CustomerDao();
    }
    public List<CustomerCommentsDto> findAllCustomerComments(Long id){
        return customerDao.findAllCustomerComments(id);
    }
}
