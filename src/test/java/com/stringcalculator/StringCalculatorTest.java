package com.stringcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void shouldReturnZeroOnEmptyString(){
        assertEquals(0,StringCalculator.Add(""));
    }
}