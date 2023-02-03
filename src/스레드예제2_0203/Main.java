package 스레드예제2_0203;
// 스레드 생성 방법 :
// 1. 상속을 받는 방법(extends Thread) : 구현이 간편, 다른 상속을 받지 못 하는 단점이 있음.
// 2. Runnable 인터페이스로 구현 : 다른 클래스의 상속을 받을 수 있음. 스레드 객체를 만드는 과정이 필요함.
// 3. 익명의 객체로 구현 : 클래스 생성 없이 간편하게 구현할 수 있음
// 4. 익명의 객체를 람다식으로 구현
public class Main {
    public static void main(String[] args) {
        // 1번 (실제로 Thread를 상속 받았기 때문에 스레드 기능이 있음)
//        Thread clsTh1 = new CustomThread();
//        clsTh1.start(); // 내부적으로 run() 메소드가 호출됨

        // 2번
//        Runnable runTh = new RunThread(); // 수행해야할 작업내용은 포함하고 있지만 실제 스레드는 아님.
//        Thread runTh1 = new Thread(runTh); // 스레드에 넣어줘야 함!
//        runTh1.start();
//        Thread runTh2 = new Thread(runTh);
//        runTh2.start();

        // 3번
        // 익명의 객체 생성 (일회용)
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0 ; i < 10; i++) {
                    sum += i;
                    System.out.println("" + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + " 합계 : " + sum);
            }
        }; // 구현부의 끝이다 의미로 ';' 붙여야 함.
        Thread runTh3 = new Thread(task);
        runTh3.start();

        // 4번
        // 익명의 객체를 람다식으로 생성
        Runnable task2 = () -> {
            int sum = 0;
            for(int i = 0 ; i < 10; i++) {
                sum += i;
                System.out.println("" + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + " 합계 : " + sum);
        };
        Thread runTh4 = new Thread(task2);
        runTh4.start();

        System.out.println("나는 main 입니다.");
    }
}
