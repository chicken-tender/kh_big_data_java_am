package 상근날드0106;
import java.util.Arrays;
import java.util.Scanner;
// 상근날드 가게에서는 세트 메뉴를 판매 합니다.
// 햄버거는 3개 종류가 있고 음료는 2가지 종류가 있음
// 입력은 총 5개의 '가격'을 연속으로 입력 하는데 햄버거 3가지, 음료 2가지를 연속으로 입력(배열 크기 : 5)
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2개 중 싼 것 선택하고 세트 메뉴이기 때문에 50원 할인)
// 총 세트메뉴 금액을 출력하는 프로그램 작성
public class SetMenu {
    public static void main(String[] args) {
        int totalCost;
        int[] costArr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<costArr.length; i++) {
            System.out.print("가격을 입력하세요. : ");
            costArr[i] = sc.nextInt();
        }
        int burger = costArr[0];
        int bevarage = costArr[3];
        for(int i=0; i<3; i++) {
            if(costArr[i] < burger) burger = costArr[i];
        }
        for(int i=3; i>=3 && i<=4; i++) {
            if(costArr[i] < bevarage) bevarage = costArr[i];
        }
        totalCost = (burger + bevarage)-50;

        System.out.printf("햄버거 : %d\n",burger);
        System.out.printf("음료 : %d\n",bevarage);
        System.out.printf("세트메뉴 총 금액은 : %d원 입니다.\n", totalCost);
    }
}