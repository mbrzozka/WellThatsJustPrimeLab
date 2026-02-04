package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();
        int[] testValues = {6, 12, 25, 37, 100};
        for (int n : testValues) {
            ArrayList<Integer> primes = factorizer.primeFactors(n);
            System.out.println("Prime factors of " + n + ": " + primes);
        }
    }
}
