package com.example.calculator;

public class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy initialStrategy) {
        setStrategy(initialStrategy);
    }

    public void setStrategy(OperationStrategy strategy) {
        if (strategy == null) throw new IllegalArgumentException("Strategy required");
        this.strategy = strategy;
    }

    public double calculate(double left, double right) {
        return strategy.apply(left, right);
    }

    public String describe(double left, double right) {
        return "%s %s %s = %s".formatted(left, strategy.symbol(), right, calculate(left, right));
    }
}