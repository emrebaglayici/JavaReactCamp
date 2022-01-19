package day4Homework2.Adapters;

import day4Homework2.Abstract.CustomerCheckService;
import day4Homework2.CQPKPSPublicSoap12;
import day4Homework2.Entities.Customer;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer){
        CQPKPSPublicSoap12 cqpkpsPublicSoap12=new CQPKPSPublicSoap12();
        try{
            return cqpkpsPublicSoap12.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());
        }catch (NumberFormatException | RemoteException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }
}
