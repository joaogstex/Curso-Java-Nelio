package com.orderproductatv.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.orderproductatv.entities.enums.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order() {

    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary");
        sb.append("\nOrder moment: ");
        sb.append("\n" + sdf.format(moment));
        sb.append("\nOrder Status: " + status);
        sb.append("\nClient: ");
        sb.append(client.getName() + " " + "(" + client.getBirthDate() + ")" + " - " + client.getEmail());
        sb.append("\n Order Items : ");
        for(OrderItem oItem : items) {
            sb.append(oItem);
        }
        sb.append("\nTotal: " + total());
        return sb.toString();
    }
}
