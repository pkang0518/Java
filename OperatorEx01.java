public class OperatorEx01 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int sum1 = i1 + i2;

        System.out.println( sum1 );

        short s1 = 10;
        short s2 = 20;
        // short sum2 = s1 + s2; // error: incompatible types
        // 에러 방지를 위해 int / (short) 사용
        // int sum2 = s1 + s2; // 방법 1
        short sum2 = (short)(s1 + s2); // 방법 2

        System.out.println( sum2 );
    }
}