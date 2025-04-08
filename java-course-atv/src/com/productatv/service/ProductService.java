package com.productatv.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.productatv.entities.ImportedProduct;
import com.productatv.entities.Product;
import com.productatv.entities.UsedProduct;

public class ProductService {
    
    static final Scanner scanner = new Scanner(System.in);
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void addProduct() throws ParseException {
        System.out.println("Enter the number of products: ");
        Integer quantity = Integer.parseInt(scanner.nextLine());
        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported? (c/u/i): ");
            Character choosenChar = scanner.nextLine().charAt(0);

            if(choosenChar == 'c') {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Price: ");
                Double price = Double.parseDouble(scanner.nextLine());

                Product product = new Product(name, price);
                products.add(product);

            } else if(choosenChar == 'u') {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Price: ");
                Double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Manufacture Date (DD/MM/YYYY): ");
                String manufactureDate = scanner.nextLine();
                Date manufacDate = sdf.parse(manufactureDate);

                UsedProduct usedProduct = new UsedProduct(name, price, manufacDate);
                products.add(usedProduct);

            } else if (choosenChar == 'i') {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Price: ");
                Double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Customs fee: ");
                Double customsFee = Double.parseDouble(scanner.nextLine());

                ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
                products.add(importedProduct);
            }
        }
        System.out.println("\nPRICE TAGS: ");
        for(Product product : products) {
            System.out.println(product);
        }
    }
}
