package com.sebone.program.collection;

import java.util.Comparator;

public class UserAge implements Comparator<UserData> {

	public int compare(UserData userData1, UserData userData2) {
		return userData1.getAge()-userData2.getAge();
	}

}
