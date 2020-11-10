/*
public class AbcdeEx02 {
    public static void main(String[] args) {
        int abc = 'a';
        for( int i=0; i<=6; i++ ) {
            for( int j=0; j<i; j++ ) {
                System.out.print((char)(abc+j));
            }
        System.out.print("\n");
        }
    }
}
*/

/*
public class AbcdeEx02 {
    public static void main(String[] args) {
        for( int i=0; i<=9; i++ ) {
            // 한 행을 출력
            for( int j=65; j<=65+i; j++ ) {
                System.out.print( (char)j );
            }
        System.out.println();
        }
    }
}
*/

public class AbcdeEx02 {
    public static void main(String[] args) {
        for( int i=0; i<=9; i++ ) {
            // 한 행을 출력
            String rowStr = "";
            for( int j=65; j<=65+i; j++ ) {
                rowStr += (char)j ;
            }
        System.out.println( rowStr );
        }
    }
}

// (p. 126) 아스키코드