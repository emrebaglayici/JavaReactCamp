package day4Homework2.Concrete;

import day4Homework2.Abstract.CustomerCheckService;


public class CustomerCheckManager implements  CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {

        return true ;
    }
}
