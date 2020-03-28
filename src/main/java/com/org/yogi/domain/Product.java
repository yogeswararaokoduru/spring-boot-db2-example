package com.org.yogi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.math.BigDecimal;

/**
 * Created by yogi
 */
@Entity
@Data
public class Product {

    @javax.persistence.Id
    @GeneratedValue
    private Long id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
