package 배열로또번호생성0106;
import java.util.Arrays;
// 1 ~ 45 사이의 임의의 숫자 6개로 구성
/* <미션>
 (1) 배열로 로또 번호 생성해 출력 하기
 (2) 배열로 로또 번호 생성(중복 제거)
 (3) 다른 자료구조를 사용해 로또 번호 만들기(ArrayList, Set)
 */
/* <힌트>
 (1) 정수형 배열 생성, 갯수는 6개(로또 번호 저장을 위한 공간)
 (2) 반복문(6회)을 만들어 순회 하면서 1 ~ 45 사이의 임의의 숫자를 배열에 대입
 (3) 배열의 요소(element)를 출력
 */
public class RandomLotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int tmp; // 생성된 로또 번호를 배열에 넣기전에 임시로 저장(배열에 한 개만 들어가니까 임시공간 1개만 설정)
        boolean isExist = false; // 번호의 중복 여부 확인
        int index = 0;
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            // 중복 확인 구간
            for(int i=0; i<lotto.length; i++) {
                if(lotto[i] == tmp) isExist = true; // 배열에 생성된 로또 번호가 있으면 true
            }
            // 생성된 번호가 배열내에 없으면 저장, 인덱스 계산 해줘야 함.
            if(isExist == false) lotto[index++] = tmp;
            // 로또 번호가 6개 만들어 졌으면 반복문 탈출
            if(index == lotto.length) break;
            // 존재 여부 확인하는 변수를 초기화 시킴
            isExist = false;
        }
        System.out.println(Arrays.toString(lotto));
    }
}
