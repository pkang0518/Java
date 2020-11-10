class Util {
    // 필드(설계도)
    void doGugudan1(int dan) {
        for( int i=1; i<=9; i++) {
            System.out.println( dan + " X " + i + " = " + (dan*i) );
        }
    }

    // print - 
    String doGugudan2(int dan) {
        String result = "";
        for( int i=1; i<=9; i++) {
            System.out.println( dan + " X " + i + " = " + (dan*i) + "\n" );
        }
        return result;
    }
}


public class GugudanEx02 {
    public static void main(String[] args) {
        // 객체 생성
        Util u = new Util();
        u.doGugudan1(5);
        System.out.println(u.doGugudan2( 5 ) );
    }
}
