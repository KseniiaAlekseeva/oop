package org.example.lesson3.ClassWork;

public class Answer {
    Integer bull;
    Integer cow;
    static int numTry = 0;

    public Answer(Integer bull, Integer cow, int numTry) {
        this.bull = bull;
        this.cow = cow;
        this.numTry = numTry;
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    public int getNumTry() {
        return numTry;
    }

    public void setNumTry(int numTry) {
        this.numTry = numTry;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "bull=" + bull +
                ", cow=" + cow +
                ", numTry=" + numTry +
                '}';
    }
}
