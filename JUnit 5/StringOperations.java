package junit.demo;

import java.util.Scanner;

public class StringOperations {

    public static int getLength(String str) {
        return str.length();
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String toUpper(String str) {
        return