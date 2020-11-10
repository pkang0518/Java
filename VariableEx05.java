public class VariableEx05 {
    public static void main(String[] args) {
        // 정수 형태
        int i = 1;      //(*)
        byte b = 1;
        short s = 1;
        long l1 = 1;
        long l2 = 1L;  // long형일 경우 L을 붙여줌 * 출력값은 위에거랑 동일

        System.out.println( l1 );
        System.out.println( l2 );

        // 10진수로 변환해서 출력
        int i2 = 0b1010;
        int i8 = 030;
        int i16 = 0xA4;

        System.out.println( i2 );
        System.out.println( i8 );
        System.out.println( i16 );

        // 10진수 -> 2진수 or 8진수 or 16진수
        int i10 = 100;

        System.out.printf( "8진수 : %o\n", i10 );
        System.out.printf( "16진수 : %x\n", i10 );

    }
}