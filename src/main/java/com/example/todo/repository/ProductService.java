package com.example.cosmetics;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String getProductList() {
        return String.join(", ", productRepository.getProducts());
    }
}
