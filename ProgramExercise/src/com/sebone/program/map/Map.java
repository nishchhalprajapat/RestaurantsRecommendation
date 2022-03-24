package com.sebone.program.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.sebone.program.collection.UserData;
/*
*class name:Map
* objective:this class is created for implement various operation using map
* author:Nishchhal Prajapati 
* Date 22/03/2022
*/
public class Map {
	public static void main(String args[]) {
		//user data object
		UserData userData1=new UserData();
		userData1.setAge(5);
		userData1.setName("Nish");
		userData1.setRollNumber(7);
		UserData userData2=new UserData();
		userData2.setAge(20);
		userData2.setName("Uttkarsh");
		userData2.setRollNumber(3);
		UserData userData3=new UserData();
		userData3.setAge(21);
		userData3.setName("Rohit");
		userData3.setRollNumber(1);
		UserData userData4=new UserData();
		userData4.setAge(21);
		userData4.setName("Rohit");
		userData4.setRollNumber(2);
		//create list for user data object 
		ArrayList<UserData> userDataList=new ArrayList<UserData>();
		userDataList.add(userData1);
		userDataList.add(userData2);
		userDataList.add(userData3);
		userDataList.add(userData4);
		MapDataImpl mapDataImp=new MapDataImpl();
		//getUserNameByRollNumber function 
		HashMap<Integer, String> resultMap=mapDataImp.getUserNameByRollNumber(userDataList);
		Set<Integer> keys=resultMap.keySet();
		// print getUserNameByRollNumber
		for(Integer key:keys) {
			System.out.println("Roll Number :-> "+key+" Name :-> "+resultMap.get(key));
		}
		 HashMap<String, ArrayList<UserData>> resultMap1=mapDataImp.findUserDataMapByName(userDataList);
		 Set<String> keysOfDataMap=resultMap1.keySet();
			for(String key:keysOfDataMap) {
				ArrayList<UserData>mapUserDataGet=resultMap1.get(key);
				for(UserData user:mapUserDataGet) {
					System.out.println("User Name :->"+user.getName()+" User Age :->"+user.getAge());
				}
			}
		 ArrayList<UserData> resultMap2=mapDataImp.findUserDataListByName("Rohit", resultMap1);
		for(UserData userN:resultMap2) {
			System.out.println("User Data :-> "+userN.getName()+" "+userN.getRollNumber());
		}
		HashMap<String, ArrayList<UserData>> resultMap3=mapDataImp.updateUserAgeByName("Rohit",22, resultMap1);
		Set<String> keysOfUseAGe=resultMap3.keySet();
		for(String key:keysOfUseAGe) {
			ArrayList<UserData>mapUserDataGet=resultMap3.get(key);
			for(UserData user:mapUserDataGet) {
				System.out.println(user.getName()+" "+user.getAge());
			}
		}
	}
}
