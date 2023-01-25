package 인터페이스활용0125;

public class Main {
    public static void main(String[] args) {
        // 1번
        Customer customer = new Customer();
        Buy buyer = customer; // Customer 타입의 customer 참조변수를 Buy 인터페이스형 buyer 참조변수에 대입(casting 발생)
        // 상속관계로 있기 때문에 형변환 가능
        buyer.buy(); // buyer는 Buy 인터페이스의 메소드만 호출 가능

        // 2번
        Buy buyer2 = new Customer();
        buyer2.buy();
        //1번, 2번 같음

        Sell sell = customer; // 자동 형변환 일어남
        sell.sell(); // Sell 인터페이스가 알고있는 메소드만 접근 가능

        Customer customer1 = (Customer) sell; // 다시 역으로 형변환, 자식이 부모로 변환할 때는 명시적으로 해야 함. (다운 캐스팅)
        customer1.buy();
        customer1.sell();
    }
}
