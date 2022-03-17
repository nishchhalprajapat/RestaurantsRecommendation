package com.sebone.programs.basicProgram;
import java.util.Scanner;
/*
*class name:FibonacciSeries
* objective:this class is created for  count digit
* author:Nishchhal Prajapati 
* Date 17/03/2022
*/
public class CountDigit {
	/*
	 * function name:main
	 * objective:this is a main function 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		CountALLDigits countALLDigits=new CountALLDigits();
		int countNumber=countALLDigits.countAllDigits(number);
		System.out.println("digits in "+number+" is "+countNumber);
	}
}
class CountALLDigits{
	/*
	 * function name:factorialOfNumber
	 * objective:this is a countAllDigits function created for count digit of a given number 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public int countAllDigits(int number) {
		int countNumber=0;
		while(number%10!=0) {
		countNumber++;
		number=number/10;
		}
		return countNumber;
	} 
}
