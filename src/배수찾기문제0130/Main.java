package 배수찾기문제0130;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 문제 : 정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째줄에 n이 주어짐, 다음 줄부터 한 줄에 한 개씩 목록에 들어 있는 수가 주어짐 ( 0 ~ 10000 )
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래 처럼 출력
/* 입력:
3 <- n(주어진 수)
1
7
99
0 <- 반복문에 대한 종료
 */
/* 출력:
1 is NOT a multiple of 3.
7 is NOT a multiple of 3.
99 is a multiple of 3.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> mul = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            int val = sc.nextInt();
            if(val == 0) break;
            mul.add(val); // mul.add(new Integer(val))이 아니고 int 타입을 넣어도 되는 이유는 Wrapper 클래스 덕분!
            // add에 인덱스를 지정하지 않으면 마지막 위치에 저장됨. add(index, element)해서 원하는 위치에 추가도 가능!
        }
        for(int i = 0; i < mul.size(); i++) {
            if(mul.get(i) % n == 0) System.out.printf("%d is a multiple of %d\n",mul.get(i),n);
            else System.out.printf("%d is NOT a multiple of %d\n",mul.get(i),n);
        }
    }
}