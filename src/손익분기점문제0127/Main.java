package 손익분기점문제0127;
import java.util.Scanner;
// 손익 분기점을 달성 할 수 없으면 -1
public class Main {
    public static void main(String[] args) {
        int breakEvenPoint = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int staticCost = sc.nextInt();
        int flexibleCost = sc.nextInt();
        int productCost = sc.nextInt();
        // 예외처리
        if(flexibleCost >= productCost) {
            System.out.println("-1");
            return;
        }
        System.out.println((staticCost / (productCost - flexibleCost)) + 1);
    }
}
