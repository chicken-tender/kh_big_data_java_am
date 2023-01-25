package 인터페이스활용0125;

public class Main2 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();
        buyer.order(); // Customer 클래스에서 재정의된 메소드가 호출 됨.

        Sell seller = customer;
        seller.order(); // 동일
    }
}
