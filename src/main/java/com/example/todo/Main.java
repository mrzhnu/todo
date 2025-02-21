package com.example.cosmetics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductPrinter productPrinter = context.getBean(ProductPrinter.class);
        productPrinter.printProducts();
        context.close();
    }
}
