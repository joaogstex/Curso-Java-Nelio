package com.orderproductatv.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.orderproductatv.entities.Client;
import com.orderproductatv.entities.Order;
import com.orderproductatv.entities.OrderItem;
import com.orderproductatv.entities.Product;
import com.orderproductatv.entities.enums.OrderStatus;

public class OrderService {
    
    static final Scanner scanner = new Scanner(System.in);
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public void realizarOrdem() {

        Client client = new Client();
        Order order = new Order();
        order.setMoment(new Date());

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        client.setName(name);

        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        client.setEmail(email);

        try {
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateInput = scanner.nextLine();
        Date birthDate = sdf.parse(birthDateInput);
        client.setBirthDate(birthDate);
        } catch (Exception e) {
            System.out.println("Erro ao processar a data: " + e.getMessage());
        }
        order.setClient(client);

        System.out.println("Enter order data: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next().toUpperCase());
        if(status == OrderStatus.DELIVERED || status == OrderStatus.PENDING_PAYMENT 
        || status == OrderStatus.PROCESSING || status == OrderStatus.SHIPPED) {
            System.out.print("Status: " + status);
        }
        order.setStatus(status);
        scanner.nextLine();
        System.out.print("\nHow many items to this order? ");
        Integer items = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= items; i++) {
            Product product = new Product();
            OrderItem orderItem = new OrderItem();

            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name: ");
            String productName = scanner.nextLine();
            product.setName(productName);

            System.out.println("Product price: ");
            Double productPrice = Double.parseDouble(scanner.nextLine());
            if (product != null) {
                product.setPrice(productPrice);
                orderItem.setPrice(product.getPrice());
            } 

            System.out.println("Quantity: ");
            Integer quantity = Integer.parseInt(scanner.nextLine());
            orderItem.setQuantity(quantity);

            orderItem.setProduct(product);

            orderItem.subTotal();
            order.addItem(orderItem);
        }
        System.out.println(order.toString());
    }
}
