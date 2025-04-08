package com.productatv;

import java.text.ParseException;

import com.productatv.service.ProductService;

public class Main {
    public static void main(String[] args) throws ParseException {
        ProductService productService = new ProductService();
        productService.addProduct();
    }
}
