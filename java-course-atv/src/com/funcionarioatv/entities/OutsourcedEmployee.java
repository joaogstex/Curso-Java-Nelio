package com.funcionarioatv.entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer workedHours, Double valuePerHour, Double additionalCharge) {
        super(name, workedHours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee() {}

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    @Override
    public String toString() {
        return this.getName() + " - $ " + payment();
    }
    
}
