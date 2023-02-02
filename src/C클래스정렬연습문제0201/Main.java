package C클래스정렬연습문제0201;
import java.util.Scanner;
import java.util.TreeSet;
// 학생의 수를 입력 받기
// 학생의 수 만큼의 객체를 생성하여 정보를 입력 (이름, 성적, 학번)
// 학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번 순으로 정렬
// 그리고 출력시 등수가 표시 되도록 할 것
// 입력 예시)
// 학생 수 : 3
// 안유진 99 202301
// 정국 87 202302
// 정채연 88 202303
// 출력 예시)
// 학생 성적 출력
// -------------------------
// 석차   이름   성적    학번
// -------------------------
//   1   안유진   99   202301
public class Main {
    public static void main(String[] args) {
        int grade = 0;
        int preScore = 0;
        TreeSet<Student> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            String studentNum = sc.next();
            ts.add(new Student(name, score, studentNum));
        }
        System.out.println("  < 학생 성적 출력  >  ");
        System.out.println("---------------------------");
        System.out.println("석차    이름    성적    학번");
        System.out.println("---------------------------");
        for (Student e : ts) {
            if(preScore != e.score) grade++;
            System.out.println(" " + grade + "    " + e.name + "     " + e.score + "    " + e.studentNum);
            preScore = e.score;
        }
    }
}