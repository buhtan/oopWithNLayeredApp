package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements productDao{

	public void add(Product product) {
		 System.out.println("JDBC ile veritabanina eklendi..");
		
	}

}
