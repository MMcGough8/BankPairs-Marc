package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private Object accountHolder;
    protected Double balance;
    private String accountNumber;
    private List<String> transactions;

    public Account(Object accountHolder, Double balance, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
    }

    public Object getAccountHolder() {
        
        return accountHolder;
    }

    public Double getBalance() {
        
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
       
        return accountNumber;
    }

    public void credit(Double amount) {
        this.balance = this.balance + amount;
        transactions.add("Credit: $" + amount);
    }

    public void debit(Double amount) {
        this.balance = this.balance - amount;
        transactions.add("Debit: $" + amount);  
    }

    public Object getTransactions(){
        
        return transactions;
    }
}

