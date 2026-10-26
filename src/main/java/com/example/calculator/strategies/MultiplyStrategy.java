package com.example.calculator.strategies;

import com.example.calculator.OperationStrategy;

public class MultiplyStrategy implements OperationStrategy {
    @Override
    public double apply(double left, double right) {
        return left * right;
    }

    @Override
    public String symbol() {
        return "*";
    }
}