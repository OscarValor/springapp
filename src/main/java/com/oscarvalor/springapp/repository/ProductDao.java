package com.oscarvalor.springapp.repository;

import java.util.List;

import com.oscarvalor.springapp.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}
