package org.example;

import java.util.Scanner;

public class Person {

    static String readName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Expense Sheet Management System. Please provide your name?");
        String name = scanner.nextLine();
        return name;
    }

    public static void main(String[] args) {
       readName();
    }
}
