package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check = true;
		
		
		while(check) {
		System.out.print("1. 로그인시도 , 2.프로그램종료 ");	
		int select=sc.nextInt();
		if(select==1) {
			System.out.print("아이디를 입력하세요: ");
			int yid = sc.nextInt();
			
			System.out.print("패스워드를 입력하세요: ");
			int ypw = sc.nextInt();
			if(yid==id && pw==ypw) {
				System.out.println("로그인성공");
				break;
			}else {
				System.out.println("로그인실패");
				
			}
			
		}else {
			break;
		}
		
		//로그인 성공 햇을 때만 진행
		//MMORPG
		//시작레벨:1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//GOLD : 0
		//5레벨 달성시 : 1000GOLD 지급
		//10레벨 달성시 : 2000GLOD 지급
		//15레벨 달성시 : 3000GLOD 지급
		//1 - 2 : 3마리잡아야 레벨업
		//2 - 3 : 6마리잡아야 레벨업
		//3 - 4 : 9마리잡아야 레벨업 3의배수로 증가
		//렙업시 게임을 계속할지 종료 할 지 선택
		
	}System.out.println("종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.print("1. 로그인시도 , 2.프로그램종료 ");	
//		int select=sc.nextInt();
//		 System.out.print("아이디를 입력하세요: ");
//		int yid = sc.nextInt();
//		
//		System.out.print("패스워드를 입력하세요: ");
//		int ypw = sc.nextInt();
//		
//		if(select==1) {
//		while(check) {
//			if(yid==id && pw==ypw) {
//				System.out.println("로그인성공");
//				break;
//			}else {
//				System.out.println("로그인실패");
//				break;
//			}
//		}if(select==2) {
//			System.out.println("종료");
//		}
//        }System.out.println("종료");
	
	}
}







