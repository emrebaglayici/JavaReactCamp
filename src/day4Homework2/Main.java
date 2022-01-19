package day4Homework2;

import day4Homework2.Abstract.BaseCustomerManager;
import day4Homework2.Concrete.NeroCustomerManager;
import day4Homework2.Entities.Customer;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(new Customer(1, "Emre", "Bağlayici", 1996, "31627769506"));
    }
}
