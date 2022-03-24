package com.sebone.program.collection;
import java.util.ArrayList;

interface SortUserData{
	ArrayList<UserData> sortByRollNumber(ArrayList<UserData> userDataList);
	ArrayList<UserData> sortByAge(ArrayList<UserData> userDataList);
	ArrayList<UserData> sortByName(ArrayList<UserData> userDataList);
}
