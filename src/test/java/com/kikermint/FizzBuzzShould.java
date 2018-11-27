package com.kikermint;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzShould {

    @Mock
    private Printer printer;
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz(printer);
    }

    @Test
    public void print_numbers() {
        fizzBuzz.evaluate(1);
        verify(printer).print("1");
    }

    @Test
    public void print_fizz() {
        fizzBuzz.evaluate(3);
        verify(printer).print("Fizz");
    }

    @Test
    public void print_buzz() {
        fizzBuzz.evaluate(5);
        verify(printer).print("Buzz");
    }

    @Test
    public void print_fizzbuzz() {
        fizzBuzz.evaluate(15);
        verify(printer).print("FizzBuzz");
    }
}