package HashSet응용0131;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
// 조건 1. 길이가 짧은 것 부터
// 조건 2. 길이가 같으면 사전 순으로
// 조건 3. 중복 제거
// 입력 : 13 but i wont hesitate no more no more it cannot wait im yours
// 출력 : i im it no but more wait wont yours cannot hesitate
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n];
        for(int i = 0; i < word.length; i++) {
            word[i] = sc.next();
        }
        // ★ HashSet을 이용해 중복 제거 후 word 배열에 다시 담음.
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        word = hashSet.toArray(new String[0]); // 배열의 크기를 0으로 지정하면 자동으로 배열 크기가 지정됨
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 결과가 양수이면 정렬 조건 (o2가 사전순으로 더 앞인 경우)
                } else {
                    return o1.length() - o2.length(); // 결과가 양수이면 정렬 조건
                }
            }
        });
        for(String e : word) System.out.print(e + " ");
    }
}
