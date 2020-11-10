class Method {
    // 선언
    void dofunc1() { // Method Method이름( ) { }
        System.out.println( "dofunc1() 호출" );
    }

    void dofunc2( int data1 ) {
        System.out.println( "dofunc2() 호출 : " + data1 );

    }

    void dofunc3( int data1, int data2 ) {
        System.out.println( "dofunc2() 호출 : " + data1 );
        System.out.println( "dofunc3() 호출 : " + data2 );
    }

    // return의 자료 형태
    // return이 없으면 void 처리
    int dofunc4( int data1, int data2 ) {
        int sum = data1 + data2;
        return sum;
    }
}



public class StudentEx02 {
    public static void main(String[] args) {
        Method m = new Method();
        // 호출
        m.dofunc1();
        m.dofunc2( 10 );
        m.dofunc3( 10, 20 );

        int result = m.dofunc4(100, 200);
        
        System.out.println( "결과 : " + result );
        // 위와 형태만 다를 뿐 출력은 같음
        System.out.println( "결과 : " + m.dofunc4(100, 200) );
    }
}