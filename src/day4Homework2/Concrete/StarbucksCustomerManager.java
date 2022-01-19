package day4Homework2.Concrete;

import day4Homework2.Abstract.BaseCustomerManager;
import day4Homework2.Abstract.CustomerCheckService;
import day4Homework2.Entities.Customer;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws NumberFormatException, RemoteException {

        if(customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        }
        else { System.out.println("Not a valid person");
        }


    }
}
