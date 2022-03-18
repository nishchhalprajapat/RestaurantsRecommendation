package com.sebone.program.basic.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.sebone.program.basic.PrimeNumber;
class PrimeNumberTest {

	@Test
	void test() {
		PrimeNumber primeNumber=new PrimeNumber();
		assertEquals(true, primeNumber.getPrimeNumber(5));
		assertEquals(false, primeNumber.getPrimeNumber(4));
		assertEquals(false, primeNumber.getPrimeNumber(4));
	}

}
