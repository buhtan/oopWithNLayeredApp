package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements productDao{

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanina eklendi..");
		
	}

}
