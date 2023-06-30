package com.iu.study2;

public class Array1 {

	public static void main(String[] args) {
		
		
		//변수 : 한개의 data
		//array : 하나의 변수로 여러개의 data를 다룸
		
		//모든 변수는 초기화 하지않고 사용시 에러
		//지역변수 : {}안에  선언된 변수를,선언된 영역이 종료되면 메모리에서 같이 삭제
		//		개발자가 직접 초기화 진행
		//인스턴스 : 한번 만들어지면 어느곳에서든 주소만 알면 사용가능
		//		자동으로 데이터타입에 따른 기본값으로 초기화
		// 		해당 변수를 참조하는 주소값을 모를 때, 프로그램 종료시
		
		
		
		
		
		//배열(Array)
		int num=1;
		int num2=2;
		
		double d=3.12;
		
		//모을려고하는 데이터타입 [] 변수명
		int [] nums = new int [2];
		double [] avgs = new double[3];
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		
		
		//배열사용 : 배열의변수명 [인덱스번호], index번호는 정수타입(int)
		System.out.println(nums[0]);
		System.out.println(avgs[0]);
		System.out.println(chs[0]);
		System.out.println(checks[0]);
		//문자열 3개를 모을 배열
		String [] s = new String [3];
		System.out.println(s);
		
		int [] nums2 = {1,2,3};
		int nums3 [] = new int [3];
		nums = nums2;
		
		System.out.println(nums);
		
	}

}
