package com.productatv.entities;

import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        String showManufacDate = "(used) $" + super.getPrice() + " (Manufacture Date: " + manufactureDate.toString() + ")";
        return showManufacDate;
    }

    @Override
    public String toString() {
        return this.getName() + " " + priceTag();
    }
    
}
