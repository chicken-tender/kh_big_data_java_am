package 주사위게임0105;
// 주사위 2개를 던져서 합이 12이면 탈출하는 게임
public class DiceGame {
    public static void main(String[] args) {
        int dice1, dice2;
        int count = 0;
        while(true) {
            count++;
            dice1 = (int)((Math.random() * 6) + 1); // 1~6까지 랜덤한 숫자가 나옴.
            dice2 = (int)((Math.random() * 6) + 1); // 랜덤 함수는 실수형으로 값이 생성되므로 형변환 필요
            if((dice1+dice2) == 12) {
                System.out.printf("무인도를 %d번 만에 탈출합니다.",count);
                break;
            } else {
                System.out.println("주사위의 합이 " + (dice1+dice2) + " 입니다.");
            }
        }
    }
}
