package enteties.impl;

import java.util.ArrayList;
import java.util.List;

import enteties.Cart;
import enteties.Product;

public class DefaultCart implements Cart {

	private static final int DEFAULT_PRODUCT_CAPACITY = 10;
	private List<Product> products;

	{
		products = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		if (products == null || products.isEmpty()) {
			return true;
		}
		
		for (Product product : products) {
			if (product != null) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public void clear() {
		products.clear();
	}

}
