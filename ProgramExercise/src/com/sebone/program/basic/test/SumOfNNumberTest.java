package com.sebone.program.basic.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sebone.program.basic.SumOfNNumber;

class SumOfNNumberTest {

	@Test
	void test() {
		SumOfNNumber sumOfNNUmber=new SumOfNNumber();
		assertEquals(15, sumOfNNUmber.getSumOfN(5));
		assertEquals(1, sumOfNNUmber.getSumOfN(1));
		assertEquals(0, sumOfNNUmber.getSumOfN(0));
	}

}
