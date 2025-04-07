package com.orderproductatv;

import com.orderproductatv.service.OrderService;

public class Main {
    
    public static void main(String[] args) {
        OrderService os = new OrderService();
        os.realizarOrdem();
    }
}
