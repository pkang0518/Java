class Util {
    // 필드(설계도)
    void doGugudan1(int dan) {
        for( int i=1; i<=9; i++) {
            System.out.println( dan + " X " + i + " = " + (dan*i) );
        }
        System.out.println();
    }

    String doGugudan3(int ... dans) {
        String result = "";
        for( int dan : dans ) {
            for( int j=1 ; j<=9; j++ ) {
                result += dan + "X" + j + "=" + (dan*j) + "\t";
            }
            result += "\n";
        }
        return result;
    }
}

public class GugudanEx03 {
    public static void main(String[] args) {
        // 객체 생성
        Util u = new Util();
        u.doGugudan1(1);
        u.doGugudan1(3);
        System.out.println(u.doGugudan3(1, 3, 5) );
    }
}
