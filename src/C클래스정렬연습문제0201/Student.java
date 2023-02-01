package C클래스정렬연습문제0201;

public class Student implements Comparable<Student> {
    String name;
    int score;
    String studentNum;

    public Student(String name, int score, String studentNum) {
        this.name = name;
        this.score = score;
        this.studentNum = studentNum;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score == o.score) {
            return this.studentNum.compareTo(o.studentNum);
        }
        return o.score - this.score;
    }
}
