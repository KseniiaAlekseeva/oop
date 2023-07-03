package org.example.lesson1.ClassWork;

public class Ex2 {
    public static void main(String[] args) {
        CreditAccount ca = new CreditAccount(234, "Ivanov VP", 1000.0, 10.0);
        DebitAccount da = new DebitAccount(235, "Ivanov VP", 1000.0, 10.0);
        System.out.println("ca.getBalance() = " + ca.getBalance());
        ca.calculateInterest();
        System.out.println("ca.getBalance() = " + ca.getBalance());
        System.out.println("da.getBalance() = " + da.getBalance());
        da.addInterest();
        System.out.println("da.getBalance() = " + da.getBalance());

    }
}
