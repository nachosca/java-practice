package com.nacho.services;

import java.util.List;

import com.nacho.entities.Product;

public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
