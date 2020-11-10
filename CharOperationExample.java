public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        // char c3 = c2 + 1; // 컴파일 error: incompatible types
        char c3 = (char)(c2 + 1);


        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        // System.out.println("c3: " + c3); // c3에 대한 symbol값을 찾을 수 없음
        System.out.println("c3: " + c3);
    }
}