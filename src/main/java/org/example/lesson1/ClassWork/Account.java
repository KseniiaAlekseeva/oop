package org.example.lesson1.ClassWork;

public class Account {
    private Integer number;
    private String owner;
    private Double balance;

    public Account(Integer number, String owner, Double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {
    }

    protected Integer getNumber() {
        return number;
    }

    protected String getOwner() {
        return owner;
    }

    protected Double getBalance() {
        return balance;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    protected void deposit(Double amount) {
        balance += amount;
    }

    protected void withdraw(Double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Not enough money. Balance = " + balance);
    }
}
