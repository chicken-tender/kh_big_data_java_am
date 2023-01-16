package 정적메소드0116;
// 호출,계산만 할 경우에는 static으로 생성하면 편함
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDate(String fmt) { //예) Math 함수와 같은 애들
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    // 고정된 값을 사용해야 할 때 프로그램의 유일하고 변경 불가한 값 생성 final static
    final static String DOMAIN = "192.168.0.1";
}
