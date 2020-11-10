class Method {
    // 가변인자 / 오버로딩
    void dofunc( int ... datas ) { // ... 이 가변인자에 대한 이야기
        System.out.println( datas.length );

        // 풀어서 쓸 때 향상된 for문 이용
        for( int data : datas ) {
            System.out.println( data + "\t");
        }
        System.out.println();
    }
}

public class MethodEx03 {
    public static void main(String[] args) {
        Method m = new Method();
        m.dofunc();
        m.dofunc( 10 );
        m.dofunc( 10, 20 );
    }
}