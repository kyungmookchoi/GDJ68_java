package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Hap hap = new Hap();
		
		int sum = hap.h1(10, 12);
		
		//h2
		
		boolean cek = hap.h2(20);
		System.out.println(cek);
		
		//h3 리턴받아서 length 출력
		
		int [] ar = hap.h3(5);
		System.out.println(ar.length);
		

	}
	
	
	}


