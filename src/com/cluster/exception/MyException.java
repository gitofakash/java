package com.cluster.exception;

public class MyException extends Exception {
	
		String str1;

		public MyException(String str1) {
			super();
			this.str1 = str1;
		}

		@Override
		public String toString() {
			return ("Exception occured : "+ str1);
		}
		
		

}
