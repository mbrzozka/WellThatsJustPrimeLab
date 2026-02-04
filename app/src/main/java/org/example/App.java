package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorizer factorizer = new Factorizer();
        System.out.print("Enter a positive integer to factorize: ");
        // Validate input
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            // Throw away invalid input
            sc.next();
            System.out.print("Enter a positive integer to factorize: ");
        }
        int n = sc.nextInt();
        // Validate positive integer
        while (n <= 0) {
            System.out.println("Number must be positive.");
            System.out.print("Enter a positive integer to factorize: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                sc.next();
                System.out.print("Enter a positive integer to factorize: ");
            }
            n = sc.nextInt();
        }
        // Call factorizer method and display results
        ArrayList<Integer> primes = factorizer.primeFactors(n);
        System.out.println("Prime factors of " + n + ": " + primes);
        sc.close();
    }
}