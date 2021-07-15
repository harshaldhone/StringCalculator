package com.stringcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("Empty string Test")
    public void shouldReturnZeroOnEmptyString(){
        assertEquals(0,StringCalculator.Add(""));
    }

    @Test
    @DisplayName("Number Return Test")
    public void shouldReturnNumonNum(){
        assertEquals(1,StringCalculator.Add("1"));
    }

    @Test
    @DisplayName("Addition Return Test")
    public void shouldReturnSumOfTwoNumbers(){
        assertEquals(5,StringCalculator.Add("3,2"));
    }

    @Test
    @DisplayName("Addition Return Test")
    public void shouldReturnSumOfNumbers(){
        assertEquals(15,StringCalculator.Add("3,2,10"));
    }


}