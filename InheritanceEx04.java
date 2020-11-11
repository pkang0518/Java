class Parent {
    void viewParent() {
        System.out.println( "viewParent() 호출" );
    }
}

class Child extends Parent {
    // 재정의(overide)
    void viewParent() {                                   // <- 재정의(overide)
        System.out.println( "child viewParent() 호출" );  // <- 처리된 부분
    }
    void viewChild() {
        super.viewParent(); // super.~ 의 의미 부모를 참조해서!(자식 안에서 부모를 부르는 것)
        this.viewParent(); // this.~ 나의 함수를 부르고 싶을 때 사용
        System.out.println( "viewChild() 호출" );
    }
}

public class InheritanceEx04 {
    public static void main (String[] args) {
        Child c = new Child();
        c.viewChild();
        c.viewParent();
    }
}
