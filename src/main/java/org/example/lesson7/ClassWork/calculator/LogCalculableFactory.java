package org.example.lesson7.ClassWork.calculator;

public class LogCalculableFactory implements ICalculableFactory{
    Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }

    public LogCalculableFactory() {
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg),logger);
    }
}
