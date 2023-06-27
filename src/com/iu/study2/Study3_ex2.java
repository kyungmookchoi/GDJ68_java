package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 데이터

		int id=1234;
		int pwd=5678;
		boolean loginResult=false;
	
		//로그인 과정
		//아이디,패스워드 입력받아서 로그인 처리!
		//로그인 성공,로그인 실패 출력
		System.out.println("로그인 메뉴입니다.");
		System.out.println("아이디를 입력하세요.");
		System.out.print("아이디 : ");
		int inputid = sc.nextInt();
		
		System.out.println("비밀번호를 입력하세요.");
		System.out.print("비밀번호 : ");
		int inputpwd = sc.nextInt();
		
		if(inputid==id && inputpwd==pwd) {
			System.out.println("로그인 성공");
			loginResult=true;
		}else {
			System.out.println("로그인 실패");
		}
		

		//---로그인처리 후 작성
		//로그인된사람만 실행가능
		//1.정규직, 2.계약직
		//급여 입력
		//정규직 : 건강보험 3%,국민연금 2%,고용보험 1%,산재보험 1%
		//실급여 출력
		//계약직 : 원천징수 3.3%
		//실급여 출력
		
		
		
		
		
		if(loginResult) {
			System.out.println("1.정규직, 2.계약직");
			int select = sc.nextInt();
			System.out.println("급여를 입력해주세요");
			int sal = sc.nextInt();
			
			switch(select) {
			case 1:
				
				double tex1 = sal*0.03;
				tex1 = tex1 + sal*0.02;
				tex1 = tex1 + sal*0.01;
				tex1 = tex1 + sal*0.01;
				sal=(int)(sal-tex1);
				
				System.out.println("실급여 : "+sal);
				break;
			case 2:
				sal = (int)(sal*0.967);
				System.out.println("실급여 : "+sal);
				break;
			default:
				System.out.println("잘못 눌렀습니다.");
			
			}
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
}		
		
		
		
		
		
		
		


