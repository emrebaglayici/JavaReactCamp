package day4Homework2.Concrete;

import day4Homework2.Abstract.BaseCustomerManager;
import day4Homework2.Abstract.CustomerCheckService;
import day4Homework2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if(customerCheckService.CheckIfRealPerson(customer))
                save(customer);
        else
            System.out.println("Not a valid person");

    }


}
