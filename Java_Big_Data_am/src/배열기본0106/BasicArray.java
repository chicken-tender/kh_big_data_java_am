package 배열기본0106;

public class BasicArray {
    public static void main(String[] args) {
        int[] score = new int[3]; //
        // new: heap 영역에 저장, score: stack 영역에 저장
        // 타입[] 참조변수 = new 타입[크기]; (크기가 정해져 있을때)
        int[] score2 = {80, 99, 70}; // 크기가 정해져 있지 않을 때 쓰는 법

        score[0] = 90;
        score[1] = 88;
        score[2] = 70;
        int sum = 0;
        for(int i=0; i<score.length; i++) {
            sum += score[i]; // sum = sum + score[i]
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f",(double)sum / score.length);
    }
}
