package com.atguigu.java.git;

public class GitDemo {
	public static void main(String[] args) {
		System.out.println("HelloWorld...");
		int[] a = {12,3,5,65,7,98,54,1,1,2,21,513,135,35,351,35,13,51,351,351,32,13,51,351,3,132,,5,151,231,351,321,513,2,43,10,42,99,11};
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length -1; j++) {
				if (a[j] < a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + "  ");
		}
	}
}
