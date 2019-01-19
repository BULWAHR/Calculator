package com.kodilla.spring.stream.reference;

public class ReferenceBeautifier {

    public static String AddABC(String text) {
        return "ABC_" + text + "_ABC";
    }

    public static String upperCaseText(String text) {
        return text.toUpperCase();
    }

    public static String replaceT(String text) {
        return text.replace("t", "_");
    }
}