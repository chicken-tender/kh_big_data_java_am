package 싱글톤0118;
// 싱글톤? 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 방법
// 왜? 메모리의 효율성과 데이터 공유의 이점이 있음
// 단점? 구현이 까다로움, 데이터의 무결성이 깨질 수 있음(멀티쓰레드에서 사용시 syncronized(동기화) 필요)
// syncronized? 여러 개의 스레드가 같은 떄에 들어갈 때 잠금 처리하여 하나씩 처리... 남발하면 성능이 현저히 떨어짐
public class SingletonMain {
    public static void main(String[] args) {
        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();
        ref1.setInfo("홍길동", 300);
        ref2.viewInfo(); // 현재 같은 스레드라 값이 안깨짐. 멀티 스레드면 값 깨질 수 있기 때문에 syncronized 해줘야 함.
    }
}
