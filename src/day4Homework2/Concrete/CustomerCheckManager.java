package day4Homework2.Concrete;

import day4Homework2.Abstract.CustomerCheckService;
import day4Homework2.Abstract.CustomerService;
import day4Homework2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
