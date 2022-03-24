package com.sebone.program.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.sebone.program.collection.UserData;
public class MapDataImpl implements MapData {
	
	public HashMap<Integer, String> getUserNameByRollNumber(ArrayList<UserData> userData) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		for(UserData user:userData) {
			map.put(user.getRollNumber(), user.getName());
		}
		return map;
	}
	
	public HashMap<String, ArrayList<UserData>> findUserDataMapByName(ArrayList<UserData> userData) {
		HashMap<String, ArrayList<UserData>> map=new HashMap<String, ArrayList<UserData>>();
		for(UserData user:userData) {
			if(map.containsKey(user.getName())) {
				ArrayList<UserData>mapUserDataGet=map.get(user.getName());
				mapUserDataGet.add(user);
			}else {
				ArrayList<UserData> mapUserData=new ArrayList<>();
				mapUserData.add(user);
				map.put(user.getName(), mapUserData);
			}
		}
		return map;
	}

	public ArrayList<UserData> findUserDataListByName(String name, HashMap<String, ArrayList<UserData>> userData) {
		ArrayList<UserData> resultList= userData.get(name);
		return resultList;
	}

	public HashMap<String, ArrayList<UserData>> updateUserAgeByName(String name, int age,
			HashMap<String, ArrayList<UserData>> userData) {
		Set<String> keys=userData.keySet();
		
		ArrayList<UserData> mapUserDataGet = userData.get(name);
		for(UserData user : mapUserDataGet) {
				user.setAge(age);
			}
		
		return userData;
	}
	
	
}
