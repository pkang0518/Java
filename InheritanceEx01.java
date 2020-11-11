class SubParent {

}

class Parent { // (p.458 참고) 원래는 class Parent (뒤 extends Object가 생략되어 있음) 
    // has ~ a 관계
    SubParent sp;
    String p;
    void viewParent() {
        System.out.println( "viewParent() 호출" );
    }
}

class Child1 extends Parent { // 상속 - class 아이명 extends 부모명
    String c;
    void viewChild1() {
        System.out.println( "viewChild1() 호출" );
    }
}

class Child2 extends Parent { // 상속 - class 아이명 extends 부모명
    String c;
    void viewChild1() {
        System.out.println( "child2 viewChild1() 호출" );
    }
}

public class InheritanceEx01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.viewParent();

        Child1 c1 = new Child1();
        c1.viewChild1();
        c1.viewParent();

        c1.c = "홍길동";
        c1.p = "박문수";
        System.out.println( c1.c );
        System.out.println( c1.p );

        Child2 c2 = new Child2();
        c2.viewChild1();
        c2.viewParent();
    }
}