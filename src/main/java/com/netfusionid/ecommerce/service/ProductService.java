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

    public List<Product> getTopTree() {

        PageRequest pageRequest = PageRequest.of(0, 3);
        Page<Product> productPageTree = productRepository.findAll(pageRequest);

        return productPageTree.toList();
        
    }
}
