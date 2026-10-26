package com.example.calculator;

import com.example.calculator.strategies.AddStrategy;
import com.example.calculator.strategies.DivideStrategy;
import com.example.calculator.strategies.MultiplyStrategy;
import com.example.calculator.strategies.SubtractStrategy;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(new AddStrategy());
        System.out.println(calc.describe(6, 3)); // 6.0 + 3.0 = 9.0

        calc.setStrategy(new SubtractStrategy());
        System.out.println(calc.describe(6, 3)); // 6.0 - 3.0 = 3.0

        calc.setStrategy(new MultiplyStrategy());
        System.out.println(calc.describe(6, 3)); // 6.0 * 3.0 = 18.0

        calc.setStrategy(new DivideStrategy());
        System.out.println(calc.describe(6, 3)); // 6.0 / 3.0 = 2.0
    }
}
