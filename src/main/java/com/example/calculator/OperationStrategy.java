package com.example.calculator;

public interface OperationStrategy {
    double apply(double left, double right);
    String symbol();
}