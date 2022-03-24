package com.sebone.program.collection.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.sebone.program.collection.SortUserDataImp;
import com.sebone.program.collection.UserData;

class SortUserDataImpTest {

	@Test
	void test() {
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
		ArrayList<UserData> resultUserDataList=new ArrayList<UserData>();
		resultUserDataList.add(userData1);
		resultUserDataList.add(userData3);
		resultUserDataList.add(userData2);
		
		SortUserDataImp sortUserDataImpl=new SortUserDataImp();
		
		assertEquals(resultUserDataList, sortUserDataImpl.sortByName(userDataList));
	}

}
