package StringBuffer0126;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정 됨. 동기화 지원(멀티스레드에서 안전)
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존 문자열이 수정 됨. 동기화 지원 X, 성능은 우수함.
// String : 객체 생성 필요 없음, 문자열 추가 시 계속 새로운 문자열이 만들어 짐. 문자열 추가가 길어지면 성능 저하.
// append() : 문자열을 추가할 때 사용
// insert() : 특정 위치에 문자열을 삽입
// substring() : 문자열을 구간을 정해 잘라냄
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("Python");
        sb.insert(0,"안녕하세요~~");
        //sb.delete(1,3); // 1번 인덱스에서 부터 3번 미만까지 지워짐
        System.out.println(sb);
        System.out.println(sb.substring(7));
        System.out.println(sb.substring(0,7));
        // StringBuffer와 StringBuilder는 문법이 똑같아서 서로 이름만 바꿔도 됨.(일반화)
    }
}
