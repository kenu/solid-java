package com.okdevtv.solid.srp;

/**
 * https://www.baeldung.com/java-single-responsibility-principle
 */
public class SrpTest {
    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Hello SRP before");
        textManipulator.printText();
    }
}
