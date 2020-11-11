class Car {
    String name = "소나타";
// 기본값을 쓰되 어떤 때는 디폴트값을 쓰고 싶어
// 생성자 오버로딩
    Car() {} // 나 기본값을 쓸래

    Car( String name ) { this.name = name; } // 나 디폴트값을 쓸래
}
public class ConstructorEx02 {
    public static void main (String[] args) {
        Car car1 = new Car( );
        System.out.println( car1.name );

        Car car2 = new Car( "그랜저" );
        System.out.println( car2.name );
    }
}