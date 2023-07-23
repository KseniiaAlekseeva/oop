package org.example.lesson7.ClassWork.jobagency;

import java.util.Random;

public class Junior implements Observer {
    private String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean())
            System.out.println(String.format("Master %s: I am waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
        else
            System.out.println(String.format("Master %s: Ok. I am ready for this job! (company, salary) = %s, %d", name, nameCompany, salary));
    }
}
