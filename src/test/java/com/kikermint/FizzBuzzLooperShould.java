package com.kikermint;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzLooperShould {
    @Mock
    private FizzBuzz fizzBuzz;
    private FizzBuzzLooper fizzBuzzLooper;

    @Before
    public void setUp() {
        fizzBuzzLooper = new FizzBuzzLooper(fizzBuzz);
    }

    @Test
    public void run_loop() {
        fizzBuzzLooper.run();
        verify(fizzBuzz, times(100))
                .evaluate(anyInt());
    }
}