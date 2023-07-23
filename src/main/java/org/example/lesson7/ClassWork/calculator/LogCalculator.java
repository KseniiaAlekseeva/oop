package org.example.lesson7.ClassWork.calculator;

public class LogCalculator implements Calculable {
    private Calculable decorated;
    private Logable logable;

    public LogCalculator(Calculator decorated, Logable logger) {
        this.decorated = decorated;
        this.logable = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logable.log("Вызвался метод суммы с параметром "+ arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logable.log("Вызвался метод умножения с параметром "+ arg);
        return decorated.multi(arg);
    }

    @Override
    public int getResult() {
        logable.log("пользователь запросил результат");
        return decorated.getResult();
    }
}
