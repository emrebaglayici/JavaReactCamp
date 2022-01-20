package day4Homework2;

import day4Homework2.Abstract.BaseCustomerManager;
import day4Homework2.Concrete.NeroCustomerManager;
import day4Homework2.Concrete.StarbucksCustomerManager;
import day4Homework2.Entities.Customer;
import org.apache.james.mime4j.dom.datetime.DateTime;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager=new NeroCustomerManager();
        customerManager.save(new Customer(1, "Emre","Bağlayici", LocalDate.of(1996,10,16),"31627769506"));
    }

}
