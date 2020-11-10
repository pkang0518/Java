/*
    Car
        회사
        모델
        색상
        최고속도
        속도
*/
// 클래스의 선언
// 원칙상 파일 1개에 클래스 1개 선언

class Car {
    // 필드(설계도)
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
}

public class CarEx01 {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();

        // 필드 값 읽기
        System.out.println("제작회사: " + myCar.company );
        System.out.println("모델명: " + myCar.model );
        System.out.println("색깔: " + myCar.color );
        System.out.println("최고속도: " + myCar.maxSpeed );
        System.out.println("현재속도: " + myCar.speed );

        // 필드 값 변형
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
}