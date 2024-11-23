package com.netfusionid.ecommerce.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.netfusionid.ecommerce.entity.Product;
import com.netfusionid.ecommerce.repository.ProductRepository;

@Service
public class ProductService {   

    private ProductRepository productRepository;

    public List<Product> getProducts(
        Integer pageNumber,
        Integer pageSize
    ) {

        PageRequest pageRequest = PageRequest.of(pageNumber-1, pageSize);
        Page<Product> products = productRepository.findAll(pageRequest);

        return products.toList();
        
    }

    public List<Product> getProducts(
        Integer pageNumber,
        Integer pageSize,
        String name
    ) {

        PageRequest pageRequest = PageRequest.of(pageNumber-1, pageSize);
        Page<Product> products = productRepository.findByNameContainsIgnoreCase(name, pageRequest);

        return products.toList();
        
    }
}
