package inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer engin=new IndividualCustomer();
        engin.customerNumber="123456";

        CorporateCustomer hepsiBurada= new CorporateCustomer();
        hepsiBurada.customerNumber="79810";

        SendikaCsutomer abc=new SendikaCsutomer();
        abc.customerNumber="999";

        CustomerManager customerManager=new CustomerManager();
        Customer[] customers={engin,hepsiBurada,abc};

        customerManager.addMultiple(customers);


    }
}
