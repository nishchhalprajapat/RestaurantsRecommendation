package com.sebone.program.basic;
import java.util.Scanner;
  /*
 *class name:Factorials
 * objective:this class is created for find factorial
 * author:Nishchhal Prajapati 
 * Date 17/03/2022
 */

public class Factorial {
	/*
	 * function name:getFactorial
	 * objective:this is a factorialOfNumber function created for find factorial of a given number 
	 * @param: input int number
	 * @return : int value
	 * Date:17/03/2022
	 */
	public int getFactorial(int number) {
		int iterator=1;
		int factorial=1;
		while(iterator<=number) {
			factorial*=iterator;
			iterator++;
		}
		return factorial;
	}
	/*
	 * function name:main
	 * objective:this is a main function 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		Factorial factorial=new Factorial();
		//find factorial function
		int factorialResult=factorial.getFactorial(number);
		System.out.println("factorial of "+number+" is "+factorialResult);
		scanner.close();
	}
}
