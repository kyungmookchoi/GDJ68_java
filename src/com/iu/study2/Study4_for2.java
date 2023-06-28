package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study4_for2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		for(int tan=0;tan<3;tan++) {
		System.out.print("1.단발, 2.점사 선택해주세요");	
		int select=sc.nextInt();
		if(select==1) {
			for(int b=0;b<30;b++) {
				System.out.println("탕");
			}
		}else {
			for(int b=0;b<10;b++) {
				System.out.println("타타탕");
			}
		}
	}
		
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		for(int i=0; i<10; i++) {
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		System.out.println("시간을 입력하세요");
//		int stmin =sc.nextInt();
//		int st = sc.nextInt();
//		
//		for(int min=0;min<=stmin;min++) {
//		for (int second = 0; second <= st; second++) {
//            System.out.printf(min+"분 : %02d초\n", second);
//        }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Random random = new Random();
//		
//		for(int i=0;i<5;i++) {
//			int num=random.nextInt(3); //0~3미만의 정수 한개를 랜덤하게 출력
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				i=5;
//				break;
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//			}
//		}
//		System.out.println("종료");
	


