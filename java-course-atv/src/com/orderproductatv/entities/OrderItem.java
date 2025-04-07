package com.orderproductatv.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;
    
    public OrderItem(Integer quantity, Product product) {
        if (product.getPrice() == null) {
            throw new IllegalArgumentException("O preço do produto não pode ser nulo");
        }
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    public OrderItem() {

    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Order Quantity: " + quantity + ", Price: " + price + ", Product: " + product + ", Subtotal: " + subTotal();
    }
}
