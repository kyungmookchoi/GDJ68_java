package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		int maxlogin = 4;
		int trylogin = 0;
		boolean check=false;
		//로그인시도 최대 5번까지
		 // 아이디 입력
		
		for(int i=0; i<5; i++) {
			 // 아이디 입력
	        System.out.print("아이디를 입력하세요: ");
	        int yid =sc.nextInt();

	        // 패스워드 입력
	        System.out.print("패스워드를 입력하세요: ");
	        int ypw =sc.nextInt();
	        if(id==yid && pw==ypw) {
	        	System.out.println("로그인성공");
	        	check=!check;
	        	break;
	        }else {
	        	System.out.println("로그인실패");
	        	System.out.println("남은 로그인횟수"+ (maxlogin-trylogin));
	      trylogin++;    
	      }	    
	        System.out.println("종료");
	        }
		if(check) {
			System.out.println("급여 계산");
		}
		}
		
	}
	        
		
		
        
		
		
	        
        
	


