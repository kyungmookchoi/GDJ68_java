package com.iu.study4;

public class StudentView {

	//Student 정보를 출력하기 위함.
	//view 
	
	
	
	public void view(Student student) {
		System.out.println(student.name);
		System.out.println(student.gender);
	}	
	
	//viewAll
	//단, 매개변수는 한개만 선언해야함.
	public void viewAll(Student [] students) {
		for(int i=0;i<students.length;i++) {
		System.out.println(students[i].name);
		System.out.println(students[i].gender);
			}
		}

	
}
