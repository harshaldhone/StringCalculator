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
    public void shouldReturnNumOnNum(){
        assertEquals(1,StringCalculator.Add("1"));
    }

    @Test
    @DisplayName("Addition of tow number Return Test")
    public void shouldReturnSumOfTwoNumbers(){
        assertEquals(5,StringCalculator.Add("3,2"));
    }

    @Test
    @DisplayName("Addition of numbers Return Test")
    public void shouldReturnSumOfNumbers(){
        assertEquals(20,StringCalculator.Add("3,2,10,5"));
    }

    @Test
    @DisplayName("Presence of Newline")
    public void checkForNewLineInInput(){
        assertEquals(10,StringCalculator.Add("3\n2,5,\n"));
    }

<<<<<<< HEAD
    @Test
    @DisplayName("Presence of Delimiters")
    public void checkForDelimiters(){
        assertEquals(10,StringCalculator.Add("//;3\n2;5"));
    }




=======
>>>>>>> parent of 56e96c0... Test for Delimeters and Modify Add method, add function addExp
}