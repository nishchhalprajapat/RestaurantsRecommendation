package com.sebone.program.map;

import java.util.ArrayList;
import java.util.HashMap;
import com.sebone.program.collection.UserData;
interface MapData {
	HashMap<Integer, String> getUserNameByRollNumber(ArrayList<UserData> userData);
	HashMap<String, ArrayList<UserData>> findUserDataMapByName(ArrayList<UserData> userData);
	ArrayList<UserData> findUserDataListByName(String name,HashMap<String, ArrayList<UserData>> userData);
	HashMap<String, ArrayList<UserData>> updateUserAgeByName(String name, int age, HashMap<String, ArrayList<UserData>> userData);
}
