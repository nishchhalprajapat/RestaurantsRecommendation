package com.sebone.program.collection;
import java.util.ArrayList;
/*
*class name:Sorting
* objective:this class is created for Sorting user data 
* author:Nishchhal Prajapati 
* Date 21/03/2022
*/
public class Sorting {

	public static void main(String args[]) {
		UserData userData1=new UserData();
		userData1.setAge(5);
		userData1.setName("aish");
		userData1.setRollNumber(7);
		UserData userData2=new UserData();
		userData2.setAge(20);
		userData2.setName("zish1");
		userData2.setRollNumber(3);
		UserData userData3=new UserData();
		userData3.setAge(21);
		userData3.setName("cish2");
		userData3.setRollNumber(1);
		ArrayList<UserData> userDataList=new ArrayList<UserData>();
		userDataList.add(userData1);
		userDataList.add(userData2);
		userDataList.add(userData3);
		SortUserDataImp sortUserDataImpl=new SortUserDataImp();
		ArrayList<UserData> finalUserDataListByName= sortUserDataImpl.sortByName(userDataList);
		for(UserData user:finalUserDataListByName) {
			System.out.println("Sort using Name :-> "+user.getRollNumber()+"  "+user.getName() + "  " +user.getAge());
		}
		ArrayList<UserData> finalUserDataListByAge= sortUserDataImpl.sortByAge(userDataList);		
		for(UserData user : finalUserDataListByAge) {
			System.out.println("Sort using Age :-> "+user.getRollNumber()+"  "+user.getName() + "  " +user.getAge());
		}
		ArrayList<UserData> finalUserDataListByRoll= sortUserDataImpl.sortByRollNumber(userDataList);
		for(UserData user : finalUserDataListByRoll) {
			System.out.println("Sort using Roll Number :-> "+user.getRollNumber()+"  "+user.getName() + "  " +user.getAge());
		}
		
		
	}
}
