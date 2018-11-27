package com.kikermint;

import static java.util.stream.IntStream.range;

class FizzBuzzLooper {

    private FizzBuzz fizzBuzz;

    FizzBuzzLooper(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    void run() {
        range(0, 100)
                .forEach(number -> fizzBuzz.evaluate(number));
    }
}
