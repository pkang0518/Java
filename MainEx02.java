// 클래스가 한개일경우 public 생략 가능
class SubEx02 {

}

class MainEx02 {
    // java (실행) 클래스명
    //      -> public static void main(String[] args) 를 찾아가 실행시켜!
    // public void main(String[] args) { // <- 에러! MainEx01 클래스에서 기본 메소드가 static이(가) 아닙니다. 다음 형식으로 기본 메소드를 정의하십시오.
    public static void main (String[] args) {
        System.out.println( "Hello Java" );
    }
}