package com.funcionarioatv.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.funcionarioatv.entities.Employee;
import com.funcionarioatv.entities.OutsourcedEmployee;

public class EmployeeService {
    
    static final Scanner scanner = new Scanner(System.in);
    public void registrarFuncionario() {

        System.out.println("Enter the number of employees: ");
        Integer quantity = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        
        for(int i = 1; i <= quantity; i++) {
            System.out.println("Employee #"+i+" data:");
            System.out.println("Outsourced (y/n)? ");
            String oChoice = scanner.nextLine();

            if(oChoice.equals("y") || oChoice.equals("Y")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Hours: ");
                Integer workedHours = Integer.parseInt(scanner.nextLine());            
                System.out.println("Value per hour: ");
                Double valuePerHour = Double.parseDouble(scanner.nextLine());
                System.out.println("Additional Charge: ");
                Double additionalCharge = Double.parseDouble(scanner.nextLine());
                
                OutsourcedEmployee oEmployee = new OutsourcedEmployee(name, workedHours, valuePerHour, additionalCharge);
                oEmployee.payment();
                employees.add(oEmployee);
                /*
                for (int j = 0; j < employees.size(); j++) {
                    System.out.println(employees.get(j).getName() + " - " + employees.get(j).payment());
                }
                */
            } else if (oChoice.equals("n") || oChoice.equals("N")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Hours: ");
                Integer workedHours = Integer.parseInt(scanner.nextLine());            
                System.out.println("Value per hour: ");
                Double valuePerHour = Double.parseDouble(scanner.nextLine());
            
                Employee employee = new Employee(name, workedHours, valuePerHour);
                employee.payment();
                employees.add(employee);
                /* 
                for (int j = 0; j < employees.size(); j++) {
                    System.out.println(employees.get(j).getName() + " - " + employees.get(j).payment());
                }
                */
            }
        }
            System.out.println("PAYMENTS: ");
            for (Employee empl : employees) {
                System.out.println(empl);
            }
    }
}
