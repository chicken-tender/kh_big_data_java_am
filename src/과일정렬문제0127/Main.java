package 과일정렬문제0127;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고, 길이가 같으면 사전(알파벳 순서)순으로 정렬하기
// String length()
// String compareTo()
// Arrays.sort(배열이름, new Comparator<String>() { @Override compare()..정렬 조건 구현..}
public class Main {
    public static void main(String[] args) {
        String[] fruitArr = new String[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            String fruit = sc.nextLine();
            fruitArr[i] = fruit;
        }
        Arrays.sort(fruitArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; // o1길이가 o2길이보다 길면 정렬하라.
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2); // return이 양수면 o2가 더 짧다., 정렬하라.
                        // compareTo()는 아스키코드를 비교함
                    }
                    return -1; // 음수값은 현 상태 유지, 즉 else면 현 상태 유지하라.
                }
            }
        });
        for(String e : fruitArr) System.out.print(e + " ");
    }
}
