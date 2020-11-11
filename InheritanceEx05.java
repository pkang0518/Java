class Parent {
    // final void viewParent() { // final 메서드는 오버라이드 될 수 없음
    void viewParent() {
        System.out.println(  "Parent viewParent() 호출" );
    }
}

class Child extends Parent {
    // 오버라이드
    void viewParent() {
        System.out.println(  "Child viewParent() 호출" );
    }
}


public class InheritanceEx05 {
    public static void main(String[] args) {
        Child c = new Child();
        c.viewParent();
    }
}