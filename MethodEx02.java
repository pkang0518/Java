// 원칙적으로 중복 선언 void dofunc1() 은 안됨
// 하지만 Java에서는 메서드 오버로딩(overloading) 가능
// 단, 매개 변수의 타입, 개수, 순서 중 하나가 달라야함!

class Method {
    // void dofunc1() {
    //void dofunc1(double data1) {
    void dofunc1(double data1, int data2 ) {
        System.out.println( "dofunc1() 호출 1");

    }

    // void dofunc1() {  // 에러 : 이미 정의되어 있음 method dofunc1() is already defined in class Method
    // void dofunc1( int data1 ) {
    // 매개 변수의 순서가 다름
    void dofunc1( int data1, double data2 ) {
        System.out.println( "dofunc1() 호출 2");
    }
}

public class MethodEx02 {
    public static void main(String[] args) {
        Method m = new Method();
        m.dofunc1(10.5, 10);
        m.dofunc1(10, 10.5);
    }
}