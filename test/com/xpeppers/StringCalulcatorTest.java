package com.xpeppers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalulcatorTest {

    // STEP1 ***
    @Test
    public void sumOfEmptyStringIsZero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void sumOfOneNumberStringIsTheNumber() {
    }

    @Test
    public void sumTwoNumbers() {
    }

    // *** STEP1

    // STEP2
    @Test
    public void sumUnknownAmountOfNumbers() {
    }

    // STEP3
    @Test
    public void newLinesAsNumbersDelimeter() {
    }

    // STEP4
    @Test
    public void supportDifferentDelimiters() {
    }

    // STEP5
    @Test
    public void negativesNotAllowed() {
    }

    // STEP6
    @Test
    public void numberBiggerThen1000Ignored() {
    }

    // STEP7
    @Test
    public void supportAnyLengthDelimiters() {
    }

    // STEP8
    @Test
    public void allowMultipleDelimiters() {
    }

    // STEP9
    @Test
    public void allowMultipleDelimitersWithLengthLongerThanOneChar() {
    }
}
