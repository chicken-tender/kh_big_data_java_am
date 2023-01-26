package 열거타입예제enum0126;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("양경미",DevType.BACKEND,Career.JUNIOR,Gender.FEMALE);
        developer.devInfo();

        Developer developer2 = new Developer("홍길동",DevType.FRONTEND,Career.JUNIOR,Gender.MALE);
        developer2.devInfo();
    }
}
