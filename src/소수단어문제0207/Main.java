package 소수단어문제0207;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') num = word.charAt(i) - 'a' + 1;
            else num = word.charAt(i) - 'A' + 27;
            sum += num;
        }
        for(int i = 2; i < sum; i++) {
            if(sum % i == 0) isPrime = false;
        }
        if(isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
// 불필요한 횟수는 안돌아도 되니까 boolean isPrime = true로 설정해놓고 하는게 편함 !!!