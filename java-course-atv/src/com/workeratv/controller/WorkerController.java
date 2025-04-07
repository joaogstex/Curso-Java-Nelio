package com.workeratv.controller;

import com.workeratv.entities.Department;
import com.workeratv.entities.HourContract;
import com.workeratv.entities.Worker;
import com.workeratv.entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WorkerController {

    public void initiate() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();

        System.out.println("Enter department's name: ");
        String depName = scanner.nextLine();
        worker.setDepartment(depName.transform(Department::new));

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        worker.setName(workerName);

        System.out.print("Level: ");
        String level = scanner.nextLine();
        worker.setLevel(WorkerLevel.valueOf(level));

        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();
        worker.setBaseSalary(baseSalary);

        System.out.println("How many contracts to this worker? ");
        int totalContracts = scanner.nextInt();

        for(int i = 1; i <= totalContracts; i++) {
            System.out.print("Enter contract #" + i +  " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(scanner.next());

            System.out.print("Value per hour: ");
            double valperhour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hours = scanner.nextInt();

            HourContract contract = new HourContract(date, valperhour, hours);
            worker.addContract(contract);
        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.println("Level: " + worker.getLevel());
        System.out.println("Base salary: " + worker.getBaseSalary());
        System.out.println(worker.getContracts().toString());
        System.out.println("Income for 08/2018: " + worker.income(year, month));
    }
}
