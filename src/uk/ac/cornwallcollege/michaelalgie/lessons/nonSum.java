package uk.ac.cornwallcollege.michaelalgie.lessons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nonSum {
    

    public static int safeDivide(int num, int denom) throws ArithmeticException {
        if (num % denom != 0) { // % is the modular operator (similar to remainder)
            throw new ArithmeticException("inexact division");
        }
        return num / denom;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator = 1;
        int[] results = new int[4];
        int counter = 0;


        do {
            try {
                System.out.println("Input two numbers");
                numerator = scanner.nextInt();
                denominator = scanner.nextInt();
                int result = safeDivide(numerator, denominator);
                System.out.println("" + numerator + " / " + denominator + " = " + result);
                results[counter++] = result;
            } catch (ArithmeticException ex1) {
                System.out.println("ArithmeticException " + ex1.getMessage());
            } catch (InputMismatchException ex2) {
                System.out.println("Bad input");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex3) {
                System.out.println("Max numbers reached");
            }


        } while(denominator != -1);

        for(int i = 0; i < counter; i++) {
            System.out.println(results[i]);
        }
    }
}
