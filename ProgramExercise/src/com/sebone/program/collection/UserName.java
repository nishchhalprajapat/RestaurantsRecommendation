package com.sebone.program.collection;

import java.util.Comparator;

public class UserName implements Comparator<UserData> {

	public int compare(UserData userData1, UserData userData2) {
		return userData1.getName().compareTo(userData2.getName());
	}

}
