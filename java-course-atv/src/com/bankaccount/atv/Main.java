package com.bankaccount.atv;

import com.bankaccount.atv.entities.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = "";
        double deposit = 0.0;
        BankAccount ba = new BankAccount(user, deposit);

        System.out.println("Enter account holder: ");
        String name = scanner.nextLine();
        ba.setUser(name);

        System.out.println("Is  there an initial deposit (y/n)? ");
        String choice = scanner.nextLine();

        if ( choice.equals("y") ) {
            System.out.println("Enter initial deposit value: ");
            deposit = scanner.nextDouble();
            ba.addDeposit(deposit);
            System.out.println(ba);

            System.out.println("Enter a deposit value: ");
            deposit = scanner.nextDouble();
            ba.addDeposit(deposit);

            System.out.println("Updated account data: ");
            System.out.println(ba);

            System.out.println("Enter withdraw value: ");
            deposit = scanner.nextDouble();
            ba.removeDeposit(deposit);

            System.out.println("Updated account data: ");
            System.out.println(ba);
        }
        else if ( choice.equals("n") ) {

            System.out.println(ba);

            System.out.println("Enter a deposit value: ");
            deposit = scanner.nextDouble();
            ba.addDeposit(deposit);

            System.out.println("Updated account data: ");
            System.out.println(ba);

            System.out.println("Enter withdraw value: ");
            deposit = scanner.nextDouble();
            ba.removeDeposit(deposit);

            System.out.println("Updated account data: ");
            System.out.println(ba);
        }
    }
}