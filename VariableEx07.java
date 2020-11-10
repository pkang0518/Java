class Variable {
    // 전역
    // 멤버변수 - 초기화하지 않아도 자동초기화
    // 전역에는 제어문 사용 불가능
    int data1;

    void dofunc() {
        // 지역
        // 지역변수 - 항상 초기화가 필요함
        // 제어문 사용 가능
        int data2; // 에러! variable data2 might not have been initialized!
        data2 = 5; // 초기값 설정
        int data1 = 20; // 전역에 data1로 설정되어 있더라도 지역에 초기값 설정 가능
        System.out.println( "data1 : " + data1 );
        System.out.println( "this.data1 : " + this.data1 ); // this. = 자기참조 => 전역에 값을 받아옴
        System.out.println( "this : " + this ); 
        System.out.println( "data2 : " + data2 );
    }
}

public class VariableEx07 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.dofunc( );
        System.out.println( "v : " + v );

    }
}