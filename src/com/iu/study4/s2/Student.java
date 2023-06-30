package com.iu.study4.s2;

public class Student {
    private String name;
    private int num;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int num, int kor, int eng, int math) {
        this.name = name;
        this.num = num;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int calculateTotal() {
        return kor + eng + math;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}
