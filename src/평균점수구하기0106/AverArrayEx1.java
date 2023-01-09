package 평균점수구하기0106;
import java.util.Arrays;
import java.util.Scanner;
/*
상현이가 가르치는 학생은 총 5명(안유진, 유나, 변백현, 김채원, 카즈하)
기말고사를 치고 난 후 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점으로 성적을 조정해줌.
결국 모든 학생이 보충학생을 듣는다는 의미임.
총 학생의 평균을 구하는 프로그램 작성...
점수는 모두 0점 이상이고, 100점 이하인 5의 배수이다. (평균값 구할 때 형변환 안해도 된다는 뜻)
 */
// 핵심은 40점 미만인 학생을 찾아서 성적을 40점으로 만들어주는 것
public class AverArrayEx1 {
    public static void main(String[] args) {
        int sum = 0;
        // 스캐너 객체를 생성
        Scanner sc = new Scanner(System.in);
        // 가르치는 학생 5명의 성적을 저장하기 위한 배열 생성
        int[] scoreArr = new int[5];
        // 배열을 순회하면서 5명의 성적을 입력 받으면서 성적이 40점 미만이면 40점으로 변경
        for(int i=0; i<5; i++){
            System.out.print("성적 입력 : ");
            scoreArr[i] = sc.nextInt();
            if(scoreArr[i] < 40) scoreArr[i] = 40;
            sum += scoreArr[i]; // 평균을 구하기 위해서 성적을 모두 합산
        }
        System.out.println(Arrays.toString(scoreArr));
        System.out.println("평균 : " + (sum / 5)); // // 합산된 성적을 인원 수로 나누어 평균을 구함
    }
}
