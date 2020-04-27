package com.cluster.jvm;

public class ConvertMinutes {
	public static void main(String[] args) {

		int minutes = 3456789;
		int year = minutes / 525600;
		int remainingMinutes = minutes % 525600;
		int day = remainingMinutes / 1440;

		System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");

	}
}
