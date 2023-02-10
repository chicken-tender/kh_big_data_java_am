package 입출력스트림_실습예제문제_0210;

public class Student implements Comparable<Student>{
    String name;
    int korScore;
    int engScore;
    int mathScore;

    public Student(String name, int korScore, int engScore, int i) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return korScore + engScore + mathScore;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotalScore() == o.getTotalScore()) return this.name.compareTo(o.name);
        return o.getTotalScore() - this.getTotalScore();
    }
}
