package com.funcionarioatv.entities;

public class Employee {
    private String name;
    private Integer workedHours;
    private Double valuePerHour;

    public Employee(String name, Integer workedHours, Double valuePerHour) {
        this.name = name;
        this.workedHours = workedHours;
        this.valuePerHour = valuePerHour;
    }

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Integer workedHours) {
        this.workedHours = workedHours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return valuePerHour * workedHours;
    }

    @Override
    public String toString() {
        return name + " - $ " + payment();
    }
    
}
