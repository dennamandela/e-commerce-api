package com.netfusionid.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netfusionid.ecommerce.BaseResponse;
import com.netfusionid.ecommerce.entity.Product;
import com.netfusionid.ecommerce.service.ProductService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    BaseResponse getProduct(
        @RequestParam(defaultValue = "0") Integer page,
        @RequestParam(defaultValue = "10") Integer size,
        @RequestParam(required = false) String q
    ) {

        List<Product> products;

        if(q == null) {
            products = productService.getProducts(
                page, size
            );
        } else {
            products = productService.getProducts(
                page, size, q
            );
        }
        
        BaseResponse response = new BaseResponse();
        response.setStatus(true);
        response.setMessage("Success");
        response.setData(products);

        return response;

    }
}
