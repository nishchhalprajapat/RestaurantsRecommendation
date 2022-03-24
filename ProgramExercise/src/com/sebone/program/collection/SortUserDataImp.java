package com.sebone.program.collection;
import java.util.ArrayList;
import java.util.Collections;
/*
 * 
 */
public class SortUserDataImp implements SortUserData {
	
	/*
	 * 
	 */
	public ArrayList<UserData> sortByRollNumber(ArrayList<UserData> userDataList) {
		ArrayList<UserData> finalUserDataList=new ArrayList<UserData>();
		//
		for(int first=0;first<userDataList.size()-1;first++) {
			//
			for(int second=0;second<userDataList.size()-first-1;second++) {
				UserData userData1=userDataList.get(second);
				int rollNumber1=userData1.getRollNumber();
				UserData userData2=userDataList.get(second+1);
				int rollNumber2=userData2.getRollNumber();
				if(rollNumber1>rollNumber2) {
					UserData temp=userData1;
					userDataList.set(second, userData2);
					userDataList.set(second+1,temp);
				}
			}
		}
		finalUserDataList=userDataList;
		return finalUserDataList;
	}
	
	public ArrayList<UserData> sortByAge(ArrayList<UserData> userList){
		UserAge sortUserDataImpl=new UserAge();
		Collections.sort(userList,sortUserDataImpl);
		return userList;
	}
	public ArrayList<UserData> sortByName(ArrayList<UserData> userList){
		UserName sortUserDataImpl=new UserName();
		Collections.sort(userList,sortUserDataImpl);
		return userList;
	}
}
