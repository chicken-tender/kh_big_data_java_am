package 스레드예제1_0202;
// 멀티스레드란? 하나의 프로그램에서 여러가지 일을 동시에 수행 하는 것
public class Main {
    public static void main(String[] args) {
        Thread test = new TestThread();
        test.start();
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println("여기는 메인 스레드 입니다." + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}

// 스레드를 만드는 방법 1 : Thread 클래스를 상속 받는다. (제일 쉬운 방법이지만 좋은 방법은 아님. 다른 클래스 상속을 못 받음)
class TestThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println("여기는 테스트 스레드 입니다. : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}