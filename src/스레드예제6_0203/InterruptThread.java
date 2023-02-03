package 스레드예제6_0203;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("스레드 실행 중.....");
                sleep(1); // interrupt 걸릴 수 있는 타이밍 (while(true) 탈출 조건)
            }
        } catch(InterruptedException e) {
            System.out.println("인터럽트 발생......");
        }
        System.out.println("종료를 위해 자원 정리 중.....");
        System.out.println("실행 종료");
    }
}
