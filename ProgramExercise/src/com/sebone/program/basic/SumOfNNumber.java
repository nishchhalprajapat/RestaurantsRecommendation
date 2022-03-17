package com.sebone.program.basic;
import java.util.Scanner;
/*
 *class name:SumOf1ToN
 * objective:this class is created for sum of 1 to n
 * author:Nishchhal Prajapati 
 * Date 17/03/2022
 */
public class SumOfNNumber {
	/*
	 * function name:sumOfN
	 * objective:this function is created for find sum of 1 to n
	 * @param: input int number
	 * @return : int value
	 * Date:17/03/2022
	 */
	public int getSumOfN(int number) {
		int index=1;
		int sum=0;
		while(index<=number) {
			sum+=index;	
			index++;
		}
	return sum; 
	}
	/*
	 * function name:main
	 * objective:this is a main function  
	 * Date:17/03/2022
	 */
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int number =scanner.nextInt();
		SumOfNNumber sumOfN=new SumOfNNumber();
		//sum of 1 to n function
		int sum=sumOfN.getSumOfN(number);
		System.out.print("sum of 1 to "+number+" is "+sum);
		scanner.close();
		}
}
