package telran.calculator.controller;

import telran.calculator.model.Operation;

import java.util.Scanner;

public class CalculatorAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number ");
        int a = scanner.nextInt();

        System.out.println("Please enter second number ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please choose operation: AND, OR, XOR, NOT, SHIFT_LEFT, SHIFT_RIGHT," +        " UNSIGNED_SHIFT_RIGHT");
        String operation = scanner.nextLine().toUpperCase();

        System.out.println("a : "+a+" ,b "+ b + ", operation: " + operation);


        System.out.println("result: " + calc(a,b,operation));
        System.out.println("Binary: " + Integer.toBinaryString(calc(a,b,operation)));



    }

    public static int calc(int a, int b, String operation) {
        Operation operation1 = Operation.valueOf(operation);
         return (int) Operation.valueOf(String.valueOf(operation1)).apply(a,b);

    }
}
