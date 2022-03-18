package com.sebone.program.basic.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sebone.program.basic.FibonacciSeries;

class FibonacciSeriesTest {

	@Test
	void test() {
		FibonacciSeries fibonacciSeries=new FibonacciSeries();
		int [] arr= {0,1,1,2,3,5};
//		assertEquals(arr, fibonacciSeries.getFibonacciSeries(5));
		assertArrayEquals(arr,  fibonacciSeries.getFibonacciSeries(5));
	}

}
