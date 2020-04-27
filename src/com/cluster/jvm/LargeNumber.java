package com.cluster.jvm;

public class LargeNumber {

	public static void main(String[] args) {
		int[] list= {10,34,12,800,7,90,81};
		int high=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]>high)
				high=list[i];
		}
		System.out.println("Gretaest number in an array is : "+high);
	}

}
