package com.iu.study4;

public class Rifle {
		boolean mod; //true : 단발, false : 점사
		
		//메서드 선언 공식
		//접근지정자 [그외 지정자] 리턴타입 메서드명([매개변수들 선언]){
		// 실행코드 }
		//public static void main(String[] args){
		// 		 }
		
		//단발
		public void shoot1(int count) {
			int damage=20;
			for(int i=0;i<count;i++) {
			System.out.println("탕");
			}
	}
		//shoot2 : 점사쏘기 프린트물 나오게하기
		public void shoot2(int c,String n,int [] ar) {
			System.out.println("타타탕");
		}

}
