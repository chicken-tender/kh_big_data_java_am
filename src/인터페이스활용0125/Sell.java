package 인터페이스활용0125;

public interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}
