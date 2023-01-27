package CompareTo예제0127;

public class Main {
    public static void main(String[] args) {
        String test = "abcd";
        System.out.println(test.compareTo("ab")); // 양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abced")); // 음수
    }
}
