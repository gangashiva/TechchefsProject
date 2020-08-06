package com.techchefs.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Result {
	/*
	* Complete the 'compareFriends' function below.
	*
	* The function is expected to return a STRING_ARRAY.
	* The function accepts STRING_ARRAY frndsList as parameter.
	*/
	public static List<String> compareFriends(List<String> frndsList) {
	Set<String> hs = new TreeSet<String>();
	for (String s : frndsList) {
	String result = "";
	Set<String> set = new TreeSet<String>
	(Arrays.asList(s.split(",")));
	for (String str : set) {
	result = result+str+",";
	}
	result = result.substring(0, result.length() - 1);
	hs.add(result);
	}
	return new ArrayList<String>(hs);
	}


}
