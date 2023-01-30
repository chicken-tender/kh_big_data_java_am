package 제네릭응용0130;

public class Water {
    public void doPrinting() {
        System.out.println("Water 재료로 출력합니다.");
    }
    // Object 클래스 오버라이딩(toString())
    @Override
    public String toString() {
        return "재료는 Water 입니다.";
    }
}
