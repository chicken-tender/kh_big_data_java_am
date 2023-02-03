package 스레드예제4_0203;
// join() : 다른 스레드가 종료될 때 까지 기다렸다가 실행해야 하는 경우에 사용
public class Main {
    public static void main(String[] args) {
       SumTh sumTh = new SumTh();
       sumTh.start();
       try {
           sumTh.join(); // sumTh가 종료 될 때 까지 main이 대기 하고 있음
       } catch (InterruptedException e) {}
       System.out.println("합 : " + sumTh.getSum());
    }
}

class SumTh extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            sum += 1;
            try {
                sleep(1);
            } catch (InterruptedException e) {}
        }
    }
}