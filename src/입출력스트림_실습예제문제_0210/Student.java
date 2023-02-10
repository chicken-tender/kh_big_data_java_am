package 입출력스트림_실습예제문제_0210;

import Comparable예제1_0201.CarSort;

public class Student implements Comparable<Student>{
    String name;
    int korScore;
    int engScore;
    int mathScore;
    int totalScore;

    public Student(String name, int korScore, int engScore, int mathScore, int totalScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return korScore + mathScore + engScore;
    }

    @Override
    public int compareTo(Student o) {
        if(this.totalScore == o.totalScore) {
            return this.name.compareTo(o.name);
        }
        return o.totalScore - this.totalScore;
    }
}
