package com.org.yogi.services;

import com.org.yogi.commands.ProductForm;
import com.org.yogi.domain.Product;

import java.util.List;

/**
 * Created by yogi
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
