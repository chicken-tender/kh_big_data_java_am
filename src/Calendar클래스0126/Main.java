package Calendar클래스0126;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// Calendar 클래스는 추상 클래스이므로 객체 생성 없이 사용 (날짜와 시간과 달리 캘린더 표기법은 각 나라마다 다르기 때문)
// 정적 메소드인 getInstance() 메소드 이용해서 운영체제의 시간 기준의 정보를 가져옴. 포함된 필드도 전부 클래스 변수
public class Main {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date(); 와 같다.
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH) + 1); // 인덱스 정보가 넘어오기 때문에 +1 해줘야 함.
        System.out.println(now.get(Calendar.DAY_OF_WEEK));
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.AM_PM));
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));
        // yyyy년 MM월 dd일 HH시 mm분 ss초
        System.out.println(now.get(Calendar.YEAR) + "년" + (now.get(Calendar.MONTH) + 1) + "월" +
                now.get(Calendar.DAY_OF_MONTH) + "일 " + now.get(Calendar.HOUR_OF_DAY) + "시" +
                now.get(Calendar.MINUTE) + "분" + now.get(Calendar.SECOND) + "초");
    }
}
