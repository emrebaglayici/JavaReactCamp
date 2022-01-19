package day4Homework1.interfaces;
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new SqlCustomerDal());
        customerManager.add();
    }
}
