package com.iu.study4;

public class studyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		
//		Card card = new Card();
//		
//		Card card2 = new Card();
//		
//		//System.out.println(card.cvc);
//		//System.out.println(card.name);
//		
		Student s1 = new Student();
		s1.name="winter";
		s1.gender='F';
		
		Student s2 = new Student();
		s2.name="mark";
		s2.gender='M';
		
		StudentView stview = new StudentView();
		stview.view(s1);
		
		Student [] students = new Student[2];
		students[0]=s1;
		students[1]=s2;
		
		stview.viewAll(students);
		//출력->view
		
//		Student s2 = new Student();
//		s2.name="iu";
//		
//		Student [] students = new Student[2];
//		students[0] = s1;
//		students[1] = s2;
//		
//		for(int i=0; i<students.length;i++) {
//			System.out.println(students[i].name);
//			
//		}
//		
//		Student s3 = new Student();
//		s3.name = "karina";
//		
//		
//		s2=s1;
//		
//		System.out.println(s2.name);
//		
//		
		System.out.println("프로그램 종료");

	}

}
