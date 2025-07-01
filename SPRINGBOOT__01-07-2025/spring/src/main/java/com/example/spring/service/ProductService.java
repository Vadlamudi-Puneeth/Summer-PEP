package com.example.spring.service;

import com.example.spring.model.Product;
import com.example.spring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
