package com.sebone.programs.basicProgram;
import java.util.Scanner;
/*
 *class name:IsPrime
 * objective:this class is created for find prime number
 * author:Nishchhal Prajapati 
 * Date 17/03/2022
 */
public class IsPrime {
	/*
	 * function name:main
	 * objective:this is a main function 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
public static void main(String args[]) {
	Scanner scn=new Scanner(System.in);
	int number=scn.nextInt();
	IsNumberPrime prime=new IsNumberPrime();
	//find prime number function
	boolean isNumberPrimeOrNot=prime.isPrime(number);
	if(isNumberPrimeOrNot) {
	System.out.print(number+" is a prime number");
	}else {
		System.out.println(number+" not a prime number");
	}

}
}
class IsNumberPrime {
	/*
	 * function name:isNumberPrimeOrNot
	 * objective:this function is created for find given number is prime or not
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	boolean isPrime(int number) {
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
}
