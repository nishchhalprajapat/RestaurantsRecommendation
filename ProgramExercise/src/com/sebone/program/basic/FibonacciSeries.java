package com.sebone.program.basic;
import java.util.Scanner;
/*
*class name:FibonacciSeries
* objective:this class is created for fibonacci 
* author:Nishchhal Prajapati 
* Date 17/03/2022
*/
public class FibonacciSeries {
	/*
	 * function name:factorialOfNumber
	 * objective:this is a FibonacciSeries function created for find Fibonacci of a given number 
	 * @param: input int number
	 * @return : int [] value
	 * Date:17/03/2022
	 */
	public int [] getFibonacciSeries(int number) {
		int [] fibonacci=new int[number+2];
		fibonacci[0]=0;
		fibonacci[1]=1;
		for(int iterator=2;iterator<=number;iterator++) {
			fibonacci[iterator]=fibonacci[iterator-1]+fibonacci[iterator-2];
		}
		return fibonacci;
	}
	/*
	 * function name:main
	 * objective:this is a main function 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		FibonacciSeries fibonacciseries=new FibonacciSeries();
		//print fibonacci series
		int []fibonacci=fibonacciseries.getFibonacciSeries(number);
		System.out.println("fibonacci of a "+number+" is :");
		for(int iterator=0;iterator<fibonacci.length-1;iterator++ ) {
			System.out.print(fibonacci[iterator]+",");
		}
	scanner.close();
	}
}

