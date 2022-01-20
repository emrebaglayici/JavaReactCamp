package day4Homework2.Adapters;

import day4Homework2.Abstract.CustomerCheckService;
import day4Homework2.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        HRKKPSPublicSoap12 hrkkpsPublicSoap12=new HRKKPSPublicSoap12();
        return hrkkpsPublicSoap12.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getDayOfYear());
    }
}
