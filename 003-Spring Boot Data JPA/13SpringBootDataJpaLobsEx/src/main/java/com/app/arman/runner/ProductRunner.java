package com.app.arman.runner;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arman.entity.Product;
import com.app.arman.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository repo;

    public void run(String... args) throws Exception {
        File file = new File("D:/Image/s.jpg"); // Replace with your image path
        FileInputStream fis = new FileInputStream(file);
        byte[] imageData = fis.readAllBytes();
        fis.close();

        String longText = "This is a long product description... "
                + "You can write large text here to be stored in LONGTEXT column. "
                + "Make sure it's not too short to test the full CLOB support.";

        Product p = new Product(101, "IPHONE", 65000.0, imageData, longText);

        repo.save(p);

        System.out.println("Product saved successfully.");
    }
}
