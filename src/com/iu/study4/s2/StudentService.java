package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
    public Student[] makeStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요: ");
        int studentCount = scanner.nextInt();

        Student[] students = new Student[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("학생 " + (i + 1) + "의 정보를 입력해주세요");
            System.out.print("이름: ");
            String name = scanner.next();
            System.out.print("번호: ");
            int num = scanner.nextInt();
            System.out.print("국어 점수: ");
            int kor = scanner.nextInt();
            System.out.print("영어 점수: ");
            int eng = scanner.nextInt();
            System.out.print("수학 점수: ");
            int math = scanner.nextInt();

            Student student = new Student(name, num, kor, eng, math);
            students[i] = student;
        }

        scanner.close();

        return students;
    }
}


    