package com.iu.study2;

public class Array3 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		System.out.println(nums.length);
		
		int [] copyNums = new int [nums.length+1];
		
		for(int i=0; i<nums.length; i++) {
			copyNums[i] = nums[i];
		}
		
		copyNums[nums.length] = 5;
		
		nums=copyNums;
		//nums : 5칸
		//nums : 4칸으로 만들기
		copyNums = new int [nums.length-1];
		for(int i=0; i<copyNums.length; i++) {
			copyNums[i] = nums[i];
			System.out.println(nums[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
		}
		System.out.println("추가할번호를 입력하세여");

	}

}
