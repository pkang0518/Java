class Car {
    String serial;
    String name;

    // 고정값을 받겠다
    Car() {
        // this.serial = "0000";
        // this.name = "소나타";
        this( "0000", "소나타" );
        System.out.println("생성자 호출");
    } 

    // serial 고정값 name 디폴트값을 받겟다
    Car( String name ) { 
        // this.serial = "0001";
        // this.name = name;
        this( "0001", name ); 
    } 

    // serial, name 둘다 디폴트값을 받겟다
    Car( String serial, String name ) { 
        this.serial = serial;
        this.name = name; 
    } 
}

public class ConstructorEx03 {
    public static void main (String[] args) {
        Car car1 = new Car( );
        // System.out.print( car1.name );
        // System.out.println( car1.serial );
        System.out.println( car1.name + " " + car1.serial );

        Car car2 = new Car( "그랜저" );
        // System.out.print( car2.name );
        // System.out.println( car2.serial );
        System.out.println( car2.name + " " + car2.serial );

        Car car3 = new Car( "0002", "아반테" );
        // System.out.print( car3.name );
        // System.out.println( car3.serial );
        System.out.println( car3.name + " " + car3.serial );        
    }
}