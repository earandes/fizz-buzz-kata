package com.kikermint;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void print_numbers() {
        String number = fizzBuzz.evaluate(1);
        Assertions.assertThat(number).isEqualTo("1");
    }

    @Test
    public void print_fizz() {
        String number = fizzBuzz.evaluate(3);
        Assertions.assertThat(number).isEqualTo("Fizz");
    }

    @Test
    public void print_buzz() {
        String number = fizzBuzz.evaluate(5);
        Assertions.assertThat(number).isEqualTo("Buzz");
    }

    @Test
    public void print_fizzbuzz() {
        String number = fizzBuzz.evaluate(15);
        Assertions.assertThat(number).isEqualTo("FizzBuzz");
    }
}