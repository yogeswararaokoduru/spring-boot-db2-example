package com.org.yogi.repositories;

import com.org.yogi.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yogi
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
