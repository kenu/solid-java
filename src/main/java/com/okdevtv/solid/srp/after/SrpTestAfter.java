package com.okdevtv.solid.srp.after;

public class SrpTestAfter {
    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Hello SRP after");
        TextPrinter textPrinter = new TextPrinter(textManipulator);
        textPrinter.printText();
        textPrinter.printOutEachWordOfText();
        textPrinter.printRangeOfCharacters(0, 5);
    }
}
