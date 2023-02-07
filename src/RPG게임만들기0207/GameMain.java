package RPG게임만들기0207;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("강력한 체력과 물리 공격력의 전사 이름을 정하세요 : ");
        String warriorName = sc.next();
        System.out.print("궁극의 마법 능력을 지닌 마법사 이름을 정하세요 : ");
        String wizardName = sc.next();
        Character warrior = new Character(warriorName, 8, 2, 0.8, 0.5, 40, 200);
        Character wizard = new Character(wizardName, 2, 28, 0.5, 0.9, 100, 100);
        GameThread1 gameThread1 = new GameThread1(warrior, wizard);
        GameThread2 gameThread2 = new GameThread2(warrior, wizard);
        gameThread1.start();
        gameThread2.start();
    }
}
