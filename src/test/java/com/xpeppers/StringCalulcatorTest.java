package com.xpeppers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalulcatorTest {

	@Test("Step1")
	public void sumOfEmptyStringIsZero() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test("Step1")
	public void sumOfOneNumberStringIsTheNumber() {
	}

	@Test("Step1")
	public void sumTwoNumbers() {
	}

	@Test("Step2")
	public void sumUnknownAmountOfNumbers() {
	}

	@Test("Step3")
	public void newLinesAsNumbersDelimeter() {
	}

	@Test("Step4")
	public void supportDifferentDelimiters() {
	}

	@Test("Step5")
	public void negativesNotAllowed() {
	}

	@Test("Step6")
	public void numberBiggerThen1000Ignored() {
	}

	@Test("Step7")
	public void supportAnyLengthDelimiters() {
	}

	@Test("Step8")
	public void allowMultipleDelimiters() {
	}

	@Test("Step9")
	public void allowMultipleDelimitersWithLengthLongerThanOneChar() {
	}
}
