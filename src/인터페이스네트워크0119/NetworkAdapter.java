package 인터페이스네트워크0119;
// 인터페이스? 완전 추상화 개념으로 인터페이스에 포함된 메소드는 일반적으로 전부 추상 메소드이다.
// 메소드를 선언하면 추가 여부 상관없이 public abstract 키워드로 동작(안붙여도 JVM이 자동으로 붙임)
// 인터페이스 상속의 키워드는 implements
public interface NetworkAdapter {
    void connect(); // public abstract가 포함되어 있음.
}
class Wifi implements NetworkAdapter {
    String company;
    Wifi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 WiFi에 연결되었습니다.");
    }
}
class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 5G에 연결되었습니다.");
    }
}
class Lte implements NetworkAdapter {
    String company;
    Lte(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 LTE에 연결되었습니다.");
    }
}