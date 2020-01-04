package com.forgus.training.fizzbuzz;

public class FizzBuzz {

    public static String numberOff(int number) {
        if(is_divisible_with_3_or_contain_3(number) && is_divisible_with_5_or_contain_5(number)) {
            return "FizzBuzz";
        }
        if(is_divisible_with_3_or_contain_3(number)) {
            return "Fizz";
        }
        if(is_divisible_with_5_or_contain_5(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static boolean is_divisible_with_5_or_contain_5(int number) {
        return isDivisibleWith5(number) || containWith5(number);
    }

    private static boolean containWith5(int number) {
        return containWith(number,5);
    }

    private static boolean isDivisibleWith5(int number) {
        return isDivisibleWith(number,5);
    }

    private static boolean is_divisible_with_3_or_contain_3(int number) {
        return isDivisibleWith(number,3) || containWith(number,3);
    }

    private static boolean containWith(int number, int i) {
        return String.valueOf(number).contains(String.valueOf(i));
    }

    private static boolean isDivisibleWith(int number,int i) {
        return number % i == 0;
    }
}
