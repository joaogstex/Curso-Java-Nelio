package com.productatv.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        String showCustomsFee = "(Customs fee: $" + customsFee.toString() + ")";
        return showCustomsFee;
    }

    public double totalPrice() {
        return super.getPrice() + this.customsFee;
    }

    @Override
    public String toString() {
        return this.getName() + " $" + totalPrice() + " " + priceTag();
    }

    
}
