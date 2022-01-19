package day4Homework1.interfaces;

public class OracleCustomerDal implements CustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
