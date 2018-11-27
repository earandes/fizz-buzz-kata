package com.kikermint;

import static java.util.stream.IntStream.range;

class FizzBuzzLooper {

    private FizzBuzz fizzBuzz;
    private Printer printer;

    FizzBuzzLooper(FizzBuzz fizzBuzz, Printer printer) {
        this.fizzBuzz = fizzBuzz;
        this.printer = printer;
    }

    void run() {
        range(0, 100)
                .forEach(number -> printer.print(fizzBuzz.evaluate(number)));
    }
}
