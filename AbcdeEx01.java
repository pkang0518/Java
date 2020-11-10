public class AbcdeEx01 {
    public static void main(String[] args) {
    /* 방법 1
        for( int c1 = 1; c1<=6 ; c1++ ) {
            for ( int c2 =1 ; c2<=c1; c2++ ) {
                System.out.print((char)(c2+96));
            }
            System.out.print("\n");
            }
        }
    }
    */

    // 방법 2
        int ch = 'a';
        for( int i = 0 ; i<=6 ; i++) {
            for( int j= 0 ; j<=i; j++ ) {
                System.out.print((char)(ch+i));
            }
            System.out.print("\n");
            }
        }
    }