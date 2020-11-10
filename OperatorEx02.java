public class OperatorEx02 {
    public static void main(String[] args) {
        // 정수 / 정수 => 정수 => 몫(소수점 이하 없어짐)
        System.out.println( 3/ 2 ); // 1.5 그러나 출력값은 1
        System.out.println( 3/ (double)2 ); // 소수점 출력을 위해 (double)
        System.out.println( 3/ 2. ); // 소수점 출력을 위해 . 입력    
    }
}