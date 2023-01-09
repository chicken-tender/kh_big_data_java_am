package IF조건문0103;
import java.util.Scanner;
//if 조건문

public class ConditionIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        if(num  > 100) {
            System.out.println(num + "은(는) 100보다 큽니다.");
        } else if(num == 100) {
            System.out.println(num + "은(는) 100과 같습니다.");
        } else {
            System.out.println(num + "은(는) 100보다 작습니다.");
        }
    }
}
