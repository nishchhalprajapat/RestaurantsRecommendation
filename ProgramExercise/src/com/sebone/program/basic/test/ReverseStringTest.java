package com.sebone.program.basic.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sebone.program.basic.ReverseString;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverseString=new ReverseString();
		assertEquals("hsiN", reverseString.getreverseString("Nish"));
	}

}
