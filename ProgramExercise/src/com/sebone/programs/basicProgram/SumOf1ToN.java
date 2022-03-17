package com.sebone.programs.basicProgram;
import java.util.Scanner;
/*
 *class name:SumOf1ToN
 * objective:this class is created for sum of 1 to n
 * author:Nishchhal Prajapati 
 * Date 17/03/2022
 */
public class SumOf1ToN {
	/*
	 * function name:main
	 * objective:this is a main function 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public static void main(String []args) {
		Scanner scn=new Scanner(System.in);
		int number =scn.nextInt();
		SumOfN sumOfN=new SumOfN();
		//sum of 1 to n function
		int sum=sumOfN.sumOfN(number);
		System.out.println("sum of 1 to "+number+" is "+sum);
		}
}
class SumOfN{
	/*
	 * function name:sumOfN
	 * objective:this function is created for find sum of 1 to n
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public int sumOfN(int number) {
		int index=1;
		int sum=0;
		while(index<=number) {
		sum+=index;	
		index++;
		}
	return sum; 
	}
}
