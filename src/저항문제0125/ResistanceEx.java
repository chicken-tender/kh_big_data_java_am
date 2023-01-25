package 저항문제0125;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
전자 제품에서는 저항이 들어간다. 처음 색 2개에는 저항의 값, 마지막은 곱해야 하는 값
색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
값 : 0,1,2,3,4,5,6,7,8,9
곱 : 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000
입력 : yellow violet red
결과 : 4700
 */
public class ResistanceEx {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] val = {0,1,2,3,4,5,6,7,8,9};
        int[] mul = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        String[] rst = new String[3];
        int[] value = new int[3];
        long[] multi = new long[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            String word = sc.next();
            rst[i] = word;
        }
        for(int i = 0; i < color.length; i++) {
            for(int j = 0; j < rst.length; j++) {
                if(color[i].equals(rst[j])) {
                    value[j] = val[i];
                    multi[j] = mul[i];
                }
            }
        }
        long rst1 = ((value[0] * 10) + value[1]) * multi[2];
        System.out.println(rst1);
    }
}
// 내가 푼 방법도 맞으나.. 제곱함수를 이용하여 푸는 것이 문제 의도에 맞음. Math.pow(10,2) == 10 * 10;