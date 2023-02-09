package 입출력스트림_실습예제문제_0210;

public class Student {
    String name;
    int s1;
    int s2;
    int s3;

    public Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int getSum() {
        return s1+s2+s3;
    }

}
