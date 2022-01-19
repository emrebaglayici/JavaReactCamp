package day4Homework1.interfaces;

public class CustomerManager {
    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal=customerDal;
    }

    public void add(){
        //iş kodları
        customerDal.add();
    }
}
