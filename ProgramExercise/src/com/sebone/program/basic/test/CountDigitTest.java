package com.sebone.program.basic.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.sebone.program.basic.CountDigit;
class CountDigitTest {

	@Test
	void test() {
		CountDigit countDigit=new CountDigit();
		assertEquals(3, countDigit.getCountDigits(123));
		assertEquals(1, countDigit.getCountDigits(0));
		assertEquals(2, countDigit.getCountDigits(12));
		assertEquals(1, countDigit.getCountDigits(1));
		assertEquals(10, countDigit.getCountDigits(1234567890));
	}

}
