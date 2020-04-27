package com.cluster.exception;

public class OccurenceChar {
	public static void main(String[] args) {
		String str = "How was your day today";
		try {
			 int count = str.length() - str.replace("a", "").length();
		        System.out.println("Number of occurances of 'a' is : "+count);
		}catch (Exception e) {
		System.out.println(e);
		}
       
 
	}

}
