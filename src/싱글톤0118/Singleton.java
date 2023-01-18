package 싱글톤0118;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton(); // 참조변수(singleton)가 하나만(static) 만들어진다.

    // 원래 생성자는 외부에서 호출하기 위해 쓰는 것이기 때문에 public을 쓰나..싱글톤에서만 private을 씀
    // 즉, 생성자를 통해서 객체가 생성뒤지 않도록 접근제한을 설정
    private Singleton() {
        name = "test";
        id = 100;
    }

    // 반환티입 : Singleton
    // getSingleton() 메소드를 호출 시 반환 값으로 이미 만들어져 있는 싱글톤 객체의 참조 변수를 반환
    static Singleton getSingleton() {
        return singleton;
    }
}
