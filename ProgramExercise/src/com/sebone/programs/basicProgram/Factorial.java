package com.sebone.programs.basicProgram;
import java.util.Scanner;
  /*
 *class name:Factorials
 * objective:this class is created for find factorial
 * author:Nishchhal Prajapati 
 * Date 17/03/2022
 */

public class Factorial {
	/*
	 * function name:main
	 * objective:this is a main function 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		FactorialOfNumber factorialOfNumber=new FactorialOfNumber();
		//find factorial function
		int factorial=factorialOfNumber.factorialOfNumber(number);
		System.out.println("factorial of "+number+" is "+factorial);
	}
}
class FactorialOfNumber{
	/*
	 * function name:factorialOfNumber
	 * objective:this is a factorialOfNumber function created for find factorial of a given number 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public int factorialOfNumber(int number) {
		int iterator=1;
		int factorial=1;
		while(iterator<=number) {
			factorial*=iterator;
			iterator++;
		}
		return factorial;
	}
}
