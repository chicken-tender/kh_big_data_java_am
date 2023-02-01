package 간판만들기0110;

import java.util.Scanner;
// 각 숫자마다 차지하는 공간이 다르다.
// 0은 4칸, 1은 2칸, 나머지 수는 3칸 차지
// 간판의 각 숫자 사이에는 1칸의 여백이 필요함.
// 총 입력한 숫자를 표기하기 위해 총 몇 칸이 필요한지 출력하는 프로그램
// 단, 입력은 0이 들어올 때까지 계속 반복...
// 입력 : 5611 -> 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1 = 15
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("간판 숫자를 입력하세요. : ");
            String num = sc.next();
            String[] num2 = new String[num.length()];

            for(int i = 0; i < num2.length; i++) {
                if(Integer.parseInt(num2[i]) == 0) Integer.parseInt(num2[i]);
            }
            if(num.equals("0")) break;
        }
    }
}
