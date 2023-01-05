package Continue예제0105;

public class ContinueEx {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(i%2 == 0) continue; //continue에 걸리면 조건식으로 바로 돌아감. 2의 배수(짝수)는 출력 안 됨.
            System.out.println(i);
        }
    }
}
