package 상속실습예제0113;
// 인간(Person)이라는 클래스 생성
// age : 나이 특성 (정수값, getter/setter) .. 몇 살인지?
// sleep : 잠자는 특성 (정수값, getter/setter) .. 몇 시간 잠 자는지?
// 인간으로부터 직장인을  생성
// work : 일하는 특성 (정수값, getter/setter) .. 몇 시간 일하는지?
// 인간으로부터 학생을 생성
// study : 공부하는 특성 (1 입력 "열심히", 2 입력 "적당히", 3 입력 "놀면서")
public class InheritanceEx1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Student student = new Student();
        worker.setAge(30);
        worker.setSleep(6);
        worker.setWorkTime(8);
        worker.WorkerInfo();

        student.setAge(17);
        student.setSleep(9);
        student.setStudyType();
        student.StudentInfo();
    }
}
