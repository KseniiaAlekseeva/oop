package org.example.lesson1.ClassWork;

public class CreditAccount extends Account {
    private Double percent;

    public CreditAccount(Integer number, String owner, Double balance, Double percent) {
        super(number, owner, balance);
        this.percent = percent;
    }

    public CreditAccount() {
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    protected void calculateInterest() {
        Double res = getBalance() * percent * 0.01;
        withdraw(res);
    }
}
