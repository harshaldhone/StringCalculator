package com.stringcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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



}