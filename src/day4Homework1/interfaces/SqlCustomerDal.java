package day4Homework1.interfaces;

public class SqlCustomerDal implements CustomerDal{
    @Override
    public void add() {
        System.out.println("Sql Eklendi");
    }
}
