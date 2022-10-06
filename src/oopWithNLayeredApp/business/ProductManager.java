package oopWithNLayeredApp.business;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.productDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private productDao productDao;

    private Logger[] loggers;

    public ProductManager(productDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public ProductManager(productDao productDao) {
        this.productDao = productDao;

    }


    public void add(Product product) throws Exception {

        //*buraya is kurallarini yaziyoruz..
        if (product.getUnitPrice() < 10) {
            throw new Exception("WWWW");
        }
        productDao.add(product);

        for(Logger logger: loggers) {  //[db.mail]
          logger.log(product.getName());
        }

    }

}
