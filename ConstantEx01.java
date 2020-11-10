public class ConstantEx01 {
    public static void main(String[] args) {
        // 변수
        int num = 10;
        num = 20;
        System.out.println( num );

        // 상수 (**대문자**로 선언 후 _ )
        final int C_NUM = 10;
        System.out.println( C_NUM );
    
        /*
        C_NUM = 20; // error: cannot assign a value to final variable C_NUM
        System.out.println( C_NUM ); // Variable C_NUM에 값을 할당할 수 없음
        */
    
    }
}