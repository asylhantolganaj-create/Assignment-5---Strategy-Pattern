package com.example.calculator.strategies;

import com.example.calculator.OperationStrategy;

public class DivideStrategy implements OperationStrategy {
    @Override
    public double apply(double left, double right) {
        if (right == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left / right;
    }

    @Override
    public String symbol() {
        return "/";
    }
}