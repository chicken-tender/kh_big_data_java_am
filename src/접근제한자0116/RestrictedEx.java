package 접근제한자0116;
// 접근제한자 : 객체지향언어 4가지 중요 특성 중 하나
// 사용 목적 : 내부의 필드값을 외부에서 접근하는 것을 제한하기 위함
public class RestrictedEx {
    public static void main(String[] args) { // main에서 접근하는건 외부에서 접근하는 것과 같다.
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.jobs);
        System.out.println(childRest.money);
    }
}

class ChildRest extends ParentRest {
    String jobs;
    public String getJobs() {
        return jobs;
    }
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
}