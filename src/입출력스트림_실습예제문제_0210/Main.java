package 입출력스트림_실습예제문제_0210;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
// 1. 적절한 위치에 이름과 성적 파일 생성
// * TreeSet<클래스> ts = new TreeSet<>();
// 2. FileInputStream으로 생성된 파일을 읽기 위한 스트림 생성
// 3. 파일을 스캐너를 읽어 들이기 위해 스캐너 생성하고 스캐너의 입력으로 스트림 연결
// 4. 스캐너의 hasNextLine()메소드를 이용해 읽을 라인이 있는 동안 반복 수행
// 5. 스캐너의 nextLine()으로 라인별로 문자열을 읽어 들임 (예. 안유지 98 87 45)
// 6. 입력 받은 문자열을 split(" ")을 이용해 공백 기준으로 자르고 이를 문자열 배열에 대입 (요소가 4개인 배열이 생성)
// 7. 첫번째 요소는 문자열이기 때문에 변환이 필요없고 나머지는 연산을 위해 Integer.parseInt()로 변환 필요
// 8. 클래스 생성 후 객체에 담기(ts.add(new 클래스이름(생성자));)
// 9. 향상된 for문을 순회하면서 결과 출력
// 1. 이름과 3개의 성적을 객체 단위로 관리 하기 위해 클래스 생성하고 정렬을 위해 Comparable을 상속
// 2. Comparable를 상속 받아 정렬 기준에 대한 메소드를 오버라이딩해 정렬에 대한 조건을 구현
// 3. 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름순)
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> hs = new TreeSet<>();
        FileInputStream fis = new FileInputStream("C:/Dev/PracticeJava/src/입출력스트림문제/score.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            hs.add(new Student(strArr[0], Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]),Integer.parseInt(strArr[3])));
        }
        for(Student e : hs) {
            System.out.println("이름 : " + e.getName());
            System.out.println("총점 : " + e.getTotalScore());
            System.out.println("=============================");
        }
    }
}

