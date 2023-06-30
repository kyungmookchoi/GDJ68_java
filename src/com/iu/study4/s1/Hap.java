package com.iu.study4.s1;

public class Hap {
	public int h1(int num1,int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		return sum;
	}
	public boolean h2(int num) {
		boolean result=false;
		if(num%2 !=0) {
			result =! result;
		}
		return result;
		
	}
	public int[] h3(int count) {
		int nums [] = new int [count];
		return nums;
	}
	
}
