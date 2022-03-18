package com.sebone.program.basic.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sebone.program.basic.Factorial;

class FactorialTest {

	@Test
	void test() {
		Factorial factorial=new Factorial();
		assertEquals(120, factorial.getFactorial(5));
	}

}
