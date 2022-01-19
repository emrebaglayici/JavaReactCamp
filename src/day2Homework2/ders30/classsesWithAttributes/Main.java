package day2Homework2.ders30.classsesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product=new Product(1,"Laptop","Asus Laptop",5000,3,"Mavi","1");



        ProductManager productManager=new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());

    }
}
