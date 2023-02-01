package Comparable예제1_0201;
// 자동차 연식(modelYear)을 기준으로 정렬하기
// 연식이 같으면 모델명의 사전순으로 정렬하기
public class CarSort implements Comparable<CarSort> {
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear) {
            return this.modelName.compareTo(o.modelName); // 문자열일 경우, 아스키코드로 비교함
            // 정렬조건만 넣어주면 실제 정렬은 내부에서 처리해줌(quick sort)
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬 (오름차순)
    }
}
