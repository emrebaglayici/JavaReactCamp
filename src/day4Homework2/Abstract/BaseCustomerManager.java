package day4Homework2.Abstract;

public class BaseCustomerManager implements CustomerService{
    @Override
    public void save(Customer customer) throws NumberFormatException, RemoteException {

        System.out.println("Kayýt Edildi : " + customer.getFirstName());

    }
}
