package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
    // If user enters 0 function should return empty list
    @Test
    void itReturnsAnEmptyListForZero() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
    }

    // If user enters 1 function should return empty list
    @Test
    void itReturnsAnEmptyListForOne() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
    }

    // If user enters negative number function should return empty list
    @Test
    void itReturnsAnEmptyListForNegative() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(-5));
    }

    // If user enters prime number function should return only that number
    @Test
    void itReturnsPrimeFactorForPrimeNumber() {
        Factorizer factorizer = new Factorizer();
        assertEquals(Arrays.asList(7), factorizer.primeFactors(7));
    }

    // Function should repeat prime factors if necessary
    @Test
    void itReturnsRepeatedPrimeFactors() {
        Factorizer factorizer = new Factorizer();
        assertEquals(Arrays.asList(2, 2, 3), factorizer.primeFactors(12));
    }

    // Function should return single factor for large prime numbers
    @Test
    void itReturnsSinglePrimeForLargePrime() {
        Factorizer factorizer = new Factorizer();
        assertEquals(Arrays.asList(37), factorizer.primeFactors(37));
    }
}
