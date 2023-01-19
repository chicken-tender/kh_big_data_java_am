package 평균은넘겠지0118;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] rst = new double[n];
        for(int i = 0; i < rst.length; i++) {
            rst[i] = overRate();
        }
        for(double e : rst) {
            System.out.printf("%.3f%%\n",e);
        }
    }

    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int sum = 0;
        double aver = 0;
        int aboveStudent = 0;
        int[] score = new int[student];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        aver = (double)sum / student;
        for(int e : score) {
            if(e > aver) aboveStudent++;
        }
        return (double)aboveStudent / student * 100;
    }
}


