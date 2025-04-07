package com.bankaccount.atv.entities;

import java.util.UUID;

public class BankAccount {

    private UUID accountNum;
    private String user;
    private double deposit;
    private double balance;

    public BankAccount(String user, double deposit) {
        this.accountNum = UUID.randomUUID();
        this.user = user;
        this.deposit = deposit;
    }

    public BankAccount(UUID accountNum) {
        this.accountNum = accountNum;
    }

    public UUID getAccountNum() {
        return accountNum;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getBalance() {
        return balance = getDeposit();
    }

    public void addDeposit(double deposit) {
        this.deposit += deposit;
    }

    public void removeDeposit(double deposit) {
        double taxa = 5;
        this.deposit = (this.deposit - deposit) - taxa;
    }

    @Override
    public String toString() {
        return "Account data: \n" +
                "Account " + getAccountNum() +
                ", Holder: " + getUser() +
                ", Balance:" + getBalance();
    }
}
