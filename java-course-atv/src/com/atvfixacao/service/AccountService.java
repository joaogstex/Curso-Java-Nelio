package com.atvfixacao.service;

import java.util.Scanner;

import com.atvfixacao.model.entities.Account;
import com.atvfixacao.model.exceptions.AccountException;

public class AccountService {
    
    static final Scanner scanner = new Scanner(System.in);
    public void transaction() {
        try {
            System.out.println("Enter account data");
            System.out.println("Number: ");
            Integer number = Integer.parseInt(scanner.nextLine());
            System.out.println("Holder: ");
            String holder = scanner.nextLine();
            System.out.println("Initial balance: ");
            Double balance = Double.parseDouble(scanner.nextLine());
            System.out.println("Withdraw limit: ");
            Double withdraw = Double.parseDouble(scanner.nextLine());

            Account account = new Account(number, holder, balance, withdraw);
            
            System.out.println("Enter amount for withdraw: ");
            Double amount = Double.parseDouble(scanner.nextLine());
            
            account.withDraw(amount);

            System.out.println(account);


        } catch(NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch(AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
   
    }
}
