package 단어공부문제0127;
import java.util.Scanner;
// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고, 결과는 대소문자 구분 하지 않음
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우는 ? 출력
// abCEFfdfeDZEfeeee
// E
public class Main {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 개수 만큼의 배열 생성(가장 많이 등장하는 알파벳 count 하기 위해)
        int max = 0; // 제일 큰 수 찾기
        char result = 0; // 결과값으로 출력할 문자를 구하기 위한 변수
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) { // 입력 받은 단어의 길이만큼 순회하면서 alphabet 배열에 횟수 누적
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) result = '?'; // 배열 인덱스의 값과 max 값이 같으면 '?'
            else if(alphabet[i] > max) {
                max = alphabet[i]; // 인덱스에 해당하는 배열 값이 더 크면 max 값을 변경
                result = (char)('A' + i); // 배열의 인덱스에서 'A'만큼의 값을 증가하여 실제 대문자 ASCII 값 출력
            }
        }
        System.out.println(result);
    }
}
