package com.kikermint;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzLooperShould {
    @Mock
    private Printer printer;
    private FizzBuzzLooper fizzBuzzLooper;

    @Before
    public void setUp() {
        fizzBuzzLooper = new FizzBuzzLooper(new FizzBuzz(), printer);
    }

    @Test
    public void run_loop() {
        fizzBuzzLooper.run();
        verify(printer, times(100))
                .print(anyString());
    }
}