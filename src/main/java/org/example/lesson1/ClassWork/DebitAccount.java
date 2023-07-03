package org.example.lesson1.ClassWork;

public class DebitAccount extends Account {
    private Double percent;

    public DebitAccount(Integer number, String owner, Double balance, Double percent) {
        super(number, owner, balance);
        this.percent = percent;
    }

    public DebitAccount() {
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    protected void addInterest() {
        Double res = getBalance() * percent * 0.01;
        deposit(res);
    }
}
