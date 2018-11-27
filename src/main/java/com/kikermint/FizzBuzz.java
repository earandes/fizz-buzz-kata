package com.kikermint;

import static java.lang.String.valueOf;

class FizzBuzz {
    private Printer printer;

    FizzBuzz(Printer printer) {
        this.printer = printer;
    }

    void evaluate(int number) {
        String print;
        if (isFizzBuzz(number)) {
            print = "FizzBuzz";
        } else if (isFizz(number)) {
            print = "Fizz";
        } else if (isBuzz(number)) {
            print = "Buzz";
        } else {
            print = valueOf(number);
        }
        printer.print(print);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }
}
