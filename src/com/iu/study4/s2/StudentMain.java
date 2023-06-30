package com.iu.study4.s2;

public class StudentMain {
    public static void printStudentInfo(Student[] students) {
        System.out.println("===== 학생 정보 =====");
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1));
            System.out.println("이름: " + students[i].getName());
            System.out.println("번호: " + students[i].getNum());
            System.out.println("국어 점수: " + students[i].getKor());
            System.out.println("영어 점수: " + students[i].getEng());
            System.out.println("수학 점수: " + students[i].getMath());
            System.out.println("총점: " + students[i].calculateTotal());
            System.out.println("평균: " + students[i].calculateAverage());
            System.out.println("===================");
        }
    }

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student[] students = studentService.makeStudents();
        printStudentInfo(students);
    }
}
