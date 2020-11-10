class Variable {
    int data = 10;
    
    void dofunc1() {
        System.out.println( "dofunc1() 호출" );
        System.out.println( "data : " + this.data ); // this. = 전역에 있는 data값을 출력해라 
        this.dofunc2();
    }

    void dofunc2() {
        System.out.println( "dofunc2() 호출" );
    }
}

public class VariableEx08 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.dofunc1();
    }
}