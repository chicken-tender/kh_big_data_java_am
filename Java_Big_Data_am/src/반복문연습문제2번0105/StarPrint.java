package 반복문연습문제2번0105;
import java.util.Scanner;
// 입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int star = sc.nextInt();

        for(int i=0; i<star; i++) {
            for(int j=0; j<(i+1); j++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}
