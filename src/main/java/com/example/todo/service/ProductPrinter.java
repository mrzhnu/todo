package com.example.cosmetics;

public class ProductPrinter {
    private final ProductService productService;

    public ProductPrinter(ProductService productService) {
        this.productService = productService;
    }

    public void printProducts() {
        System.out.println("Доступные косметические продукты: " + productService.getProductList());
    }
}
