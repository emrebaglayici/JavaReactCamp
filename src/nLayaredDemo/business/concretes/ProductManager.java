package nLayaredDemo.business.concretes;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.core.LoggerService;
import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;
import nLayaredDemo.jLogger.JloggerManager;

import java.util.List;

public class ProductManager implements ProductService{
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        //İş kodları
        if(product.getCategoryId()==1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi"+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
