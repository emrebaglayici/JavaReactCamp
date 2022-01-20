package day4Homework2.Abstract;

import day4Homework2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void save(Customer customer) {
        System.out.println("Saved to db : "+customer.getFirstName());
    }
}
