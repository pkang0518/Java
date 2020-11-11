class CodeBlock {
    // 멤버(필드) 영역
    // 초기화 블럭이 하는 역할은 말 그대로 멤버(필드)영역의 초기화
    String name1;
    static String name2;
    {
        // 원래는 실행문이 있으면 안되지만 간접적으로 실행문을 쓰려고 만듬
        // -> 가능하면 생성자를 사용하는 것이 더 좋은 방법
        System.out.println( "인스턴스 초기화 블럭" );
        this.name1 = "홍길동";
    }
    static {
        System.out.println( "클래스 초기화 블럭" );
        CodeBlock.name2 = "박문수";
    }
}


// Block (p.239)
public class BlockEx01 {
    public static void main (String[] args) {
        System.out.println( "시작" );
        CodeBlock cb = new CodeBlock();
        System.out.println( cb.name1 );
        System.out.println( CodeBlock.name2 );
        // System.out.println( cb.name1 + CodeBlock.name2 ); // Why 오류? Java에서는 , 사용 X ** + 사용    
        System.out.println( "끝" );      
    }
}