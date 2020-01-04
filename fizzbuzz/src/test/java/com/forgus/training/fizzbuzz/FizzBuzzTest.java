package com.forgus.training.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1,1",
            "Fizz,3",
            "Buzz,5",
            "FizzBuzz,15",
            "Fizz,13",
            "Buzz,52",
            "FizzBuzz,53"
    })
    void test(String result,int number) {
        assertEquals(FizzBuzz.numberOff(number),result);
    }
}
