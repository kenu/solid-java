package com.okdevtv.solid.ocp;

/**
 * https://www.baeldung.com/java-open-closed-principle
 */
public class OcpTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Addition operation = new Addition(3, 4);
        calculator.calculate(operation);
        System.out.println(operation.getResult());
    }
}
