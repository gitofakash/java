package com.cluster.ThreadCollections;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBookAss4 {

	public static void main(String[] args) {

		Map<String,Integer> tbook=new HashMap<String, Integer>();
		tbook.put("Mr.A", 812345678);
		tbook.put("Mr.B", 48023456);
		tbook.put("Mr.C", 89765123);
		System.out.println("Phone number of name1 is : "+tbook.get("Mr.A"));
	}

}
