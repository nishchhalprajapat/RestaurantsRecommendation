package com.sebone.program.basic;
import java.util.Scanner;
/*
*class name:ReverseString
* objective:this class is created for reverse number 
* author:Nishchhal Prajapati 
* Date 17/03/2022
*/
public class ReverseString {
	/*
	 * function name:factorialOfNumber
	 * objective:this is a reverseGivenString function created for  reverse string of a given string 
	 * @param: input String string
	 * @return : String value
	 */
	public String getreverseString(String string) {
		StringBuilder reversString  = new StringBuilder(string);
		int left=0;
		int right=reversString.length()-1;
		while(right>=left) {
			char temporary=reversString.charAt(left);
			reversString.setCharAt(left, reversString.charAt(right));
			reversString.setCharAt(right, temporary);	
			left++;
			right--;
			}
	return reversString.toString();
	}
	/*
	 * function name:main
	 * objective:this is a main function
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		ReverseString reverseString=new ReverseString();
		//reverse string function 
		String	reversString=reverseString.getreverseString(string);
		System.out.println("Reverse string is: "+reversString);
		scanner.close();
	}
}
