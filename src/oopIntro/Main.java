package oopIntro;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product(1,"Lenovo V14",15000,"16 GB Ram",10); //Creating a reference,instance
        /*Product product2=new Product(2,"Lenovo V15",16000,"32 GB Ram",10,14600);
        Product product3=new Product(3,"Hp 5",10000,"8 GB Ram",20,15000);*/

        product1.setId(2);
        product1.setName("Lenovo 15");
        product1.setDetail("16 Gb ram");
        product1.setDiscount(10);
        product1.setUnitPrice(16000);

        System.out.println(product1.getUnitPriceAfterDiscount());

        Category category1=new Category();
        category1.setId(1);
        category1.setName("İçecek");

        Category category2=new Category();
        category2.setId(2);
        category2.setName("Yiyecek");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

        /*Product[] products={product1,product2,product3};
        for (Product product:products) {
            System.out.println(product.getName());
        }
        System.out.println(products.length);

        Category category1=new Category();
        category1.id=1;
        category1.name="Bilgisayar";

        Category category2=new Category();
        category2.id=2;
        category2.name="Ev/Bahçe";

        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);*/
    }
}
