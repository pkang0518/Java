class Constructor {
    // 없으면 컴파일러가 자동 생성됨 - 기본생성자
    // 기본생성자 - public constructor() {}
    public Constructor() { // * public 생략 가능
        System.out.println( "생성자 호출" );
    }
}

class Car {
    String name = "소나타"; // 고정된 값
    Car( String name ) {
        this.name = name;
    }
}
public class ConstructorEx01 {
    public static void main (String[] args) {
        // Constructor() - 생성자
        Constructor c = new Constructor();
        /* 직접 호출 불가능
        c.Constructor();
        */
         
        // Car car = new Car(); // 위에서 생성자가 만들어지는 순간 사용하지 못함
        Car car = new Car( "그랜저" );
        System.out.println( car.name );
    }
}