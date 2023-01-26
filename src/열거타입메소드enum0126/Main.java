package 열거타입메소드enum0126;
// values() : 해당 열거체의 모든 상수를 저장한 배열을 생성해서 반환
// valueOf() : 전달된 문자열과 일치하는 해당 열거체의 상수를 반환
// ordinal() : 해당 열거체의 정의에서 정의된 순서(0부터 시작)를 반환
enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, NAVY, PURPLE}

public class Main {
    public static void main(String[] args) {
//        Rainbow[] arr = Rainbow.values();
//        for (Rainbow e : arr) System.out.print(e + " ");
        Rainbow rb = Rainbow.valueOf("YELLOW");
        System.out.println(rb);
//        int index = Rainbow.BLUE.ordinal();
//        System.out.println(index);
    }
}
