package com.iu.study2;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어 영어 수학 입력
		//총점 평균 계산 평균은 int
		//90:A 80:B 70C 60D 그외 F
		//switch 사용
		
		int kor = 90;
		int eng = 80;
		int math = 70;
		int total = kor+eng+math;
		int avr = total/3;
		
		switch(avr) {
		case 90:
			System.out.println("A");
		break;
		case 80:
			System.out.println("B");
		break;
		case 70:
			System.out.println("C");
		break;
		case 60:
			System.out.println("D");
		break;
		default:
			System.out.println("F");
		break;
			
		}
		System.out.println(total);
		System.out.println(avr);
	}

}
