package com.okdevtv.solid.ocp.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Division(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
        }
    }
}
