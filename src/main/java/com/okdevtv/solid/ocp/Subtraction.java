package com.okdevtv.solid.ocp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subtraction implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }
}
