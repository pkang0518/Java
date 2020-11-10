/*
    학생
        학번
        이름
        나이
        키
*/
// 클래스의 선언
// 원칙상 파일 1개에 클래스 1개 선언
class Student {
    String hakbun;
    String name;
    int age;
    double height;
}

// public이 붙은 클래스 명이 파일명이 됨.
public class StudentEx01 {
    public static void main(String[] args) {
        // 객체의 생성
        // s1 인스턴스
        Student s1;
        s1 = new Student();

        // 선언과 동시에 생성
        // new는 메모리 생성 연산자
        Student s2 = new Student();

        System.out.println( s1 ); // => Student@15db9742 자료형참조값 = 이 참조값 안에 이런 자료형이 들어가 있음

        // 클래스 데이터에 접근하는 방법
        // .은 객체 참조 연산자
        s1.hakbun = "10";
        s1.name = "홍길동";
        s1.age = 10;
        s1.height = 170.6;
        System.out.println( s1.hakbun );

        // 값을 복사하는게 아니라 주소(참조)를 복사하는 것
        Student s3 = s1;
        System.out.println( s1.name );
        System.out.println( s3.name );

        s3.name = "박문수";
        System.out.println( s1.name );
        System.out.println( s3.name );
    }
}