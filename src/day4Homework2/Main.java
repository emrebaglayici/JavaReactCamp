package day4Homework2;

import day4Homework2.Abstract.BaseCustomerManager;
import day4Homework2.Adapters.MernisServiceAdapter;
import day4Homework2.Concrete.NeroCustomerManager;
import day4Homework2.Concrete.StarbucksCustomerManager;
import day4Homework2.Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Emre","Bağlayici",1996,"316277695"));
        System.out.println();
    }
}
