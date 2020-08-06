package com.techchefs.test1;

import java.util.ArrayList;
import java.util.List;

public class Result {
	/*
	* Complete the 'processStrings' function below.
	*
	* The function is expected to return a STRING_ARRAY.
	* The function accepts following parameters:
	* 1. STRING str1
	* 2. STRING str2
	*/
	public static List<String> processStrings(String str1, String str2) {
	List<String> list = new ArrayList<>();
	String opt1 = "";
	String opt2 = "";
	for (int i = 0; i < str1.length(); i++) {
	if (!str2.contains(str1.charAt(i) + "")) {
	opt1 = opt1 + str1.charAt(i);
	}
	}
	for (int i = 0; i < str2.length(); i++) {
	if (!str1.contains(str2.charAt(i) + "")) {
	opt2 = opt2 + str2.charAt(i);
	}
	}
	list.add(opt1);
	list.add(opt2);
	return list;
	}


}
