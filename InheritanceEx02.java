class Parent {
    /*
    // 디폴트(기본) 생성자
    Parent() {
        System.out.println( "Parent 생성자 :" + this );
    }
    */

    // 정해진 값을 사용하고 싶으면 Child 부분에 super ( 값 ); 을 이용
    Parent ( String data ) {
        System.out.println( "Parent 생성자 : " + this );
    }
}

class Child extends Parent {
    Child() {
        super ( "홍길동" );
        System.out.println( "Child 생성자 :" + this );
    }
}

public class InheritanceEx02 {
    public static void main (String[] args) {
        Child c = new Child();
        System.out.println( "c : " + c );
    }
}
/*
Parent 생성자 :Child@15db9742
Child 생성자 :Child@15db9742      <= 출력값 확인 시 부모와 아이의 참조(주소)값이 같음
c : Child@15db9742                   * 같은 공간 안에 부모(먼저)와 아이(나중)가 저장되는걸 확인할 수 있음
*/