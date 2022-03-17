package com.sebone.program.basic;
import java.util.Scanner;
/*
 *class name:IsPrime
 * objective:this class is created for find prime number
 * author:Nishchhal Prajapati 
 * Date 17/03/2022
 */
public class PrimeNumber {
	/*
	 * function name: getPrimeNumber
	 * objective:this function is created for find given number is prime or not
	 * @param: input int number
	 * @return : boolean value
	 * Date:17/03/2022
	 */
	boolean getPrimeNumber(int number) {
		int isDivisibleBy=2;
		boolean isNumberPrimeOrNot=true;
		while(number>isDivisibleBy) {
			if(number%isDivisibleBy==0) {
				isNumberPrimeOrNot=false;
				return isNumberPrimeOrNot;
			}
			isDivisibleBy++;
		}
	return isNumberPrimeOrNot;
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
		PrimeNumber isNumberPrime=new PrimeNumber();
		//find prime number function
		boolean isNumberPrimeOrNot=isNumberPrime.getPrimeNumber(number);
		if(isNumberPrimeOrNot) {
			System.out.print(number+" is a prime number");
		}else {
			System.out.println(number+" not a prime number");
		}
		scanner.close();
	}
}
