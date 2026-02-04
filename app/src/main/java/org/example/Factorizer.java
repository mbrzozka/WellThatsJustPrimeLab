package org.example;

import java.util.ArrayList;

public class Factorizer {
    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> factors = new ArrayList<>();
        // If n is null, negative, 0, or 1, return empty list
        if (n == null || n < 2) {
            return factors;
        }
        // Pull out factors of 2
        while (n % 2 == 0) {
            factors.add(2);
            n = n / 2;
        }
        // Try odd numbers from 3 upwards
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        // After pulling out factors if n > 2 (like 37) then n is prime
        if (n > 2) {
            factors.add(n);
        }
        return factors;
    }
}