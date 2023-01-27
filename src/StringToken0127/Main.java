package StringToken0127;
import java.util.Scanner;
import java.util.StringTokenizer;
// StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우, 구분자 기준으로 문자열을 관리 가능
// countTokens() : 남아 있는 토큰 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인 (있으면 true)
// nextToken() : 토큰을 하나씩 꺼내 옴
public class Main {
    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // 문자열을  개행문자를 만날 때 까지 입력 받음
//        StringTokenizer st = new StringTokenizer(name, "/"); // 이름을 / 기준으로 입력
//        String[] nameStr = new String[st.countTokens()]; // 토큰의 개수만큼 문자열 배열 생성
//        while(st.hasMoreTokens()) { // 남아 있는 토큰이 있는 동안 반복문 수행
//            nameStr[idx++] = st.nextToken(); // 현재 토큰을 꺼내서 배열에 담음
//        }
//        for(String e : nameStr) System.out.print(e + " ");
        String[] nameStr = name.split("/");
        for(String e : nameStr) System.out.print(e + " ");
    }
}
