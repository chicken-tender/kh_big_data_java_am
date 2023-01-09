package 참조타입확인0106;
// 참조타입은 값이 아닌 주소를 담기 때문에 초기값으로 정수/실수 못 담음.
// null은 주소를 가르킬게 없다는 의미이다.
// 따라서, 참조타입의 기본값은 null(키워드/문자열 아님) 이다. null은 참조타입변수에만 올 수 있다.
// 참조 변수의 == (같음을 확인?)
public class RefType {
    public static void main(String[] args) {
        String name1 = "진부연";
        String name2 = "진부연";
        String name3 = new String("진부연");
        if(name1 == name3) { // 객체 주소가 같은지 확인.
            System.out.println("두개의 이름에 대한 참조가 같음");
        } else System.out.println("두개의 이름에 대한 참조가 다름"); // 실행결과

        if(name1 == name2) { // 객체 주소가 같은지 확인.
            System.out.println("두개의 이름에 대한 참조가 같음"); // 실행결과
        } else System.out.println("두개의 이름에 대한 참조가 다름");

        if(name1.equals(name3)) { // 참조변수의 실제 값이 같은지 확인.
            System.out.println("두개의 이름의 내용이 같음"); // 실행결과
        } else System.out.println("두개의 이름의 내용이 다름");
    }
}
