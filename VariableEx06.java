public class VariableEx06 {
    public static void main(String[] args) {
        // 실수형태는 주로 double 사용(*)
        // int i = 2.5; // <= error : incompatible types
        // float f = 2.5; // <= error : incompatible types
        
        double d = 2.5;

        // float을 사용하고 싶을때에는 뒤에 f를 붙여주면 됨
        float f = 2.5f;

        System.out.println( f );

        // 지수
        double d2 = 1.0e3;
        System.out.println( d2 );

    }
}