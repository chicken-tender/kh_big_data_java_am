package 스트림예제2_0208;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 87));
        list.add(new Student("이순신", 65));
        list.add(new Student("한석봉", 98));

//        list.stream().forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + "-" + score);
//        });

        double avg = list.stream().mapToInt(s -> s.getScore()).average().getAsDouble();
        System.out.printf("평균 점수 : %.2f", avg);

    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}