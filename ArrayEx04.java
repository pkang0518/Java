public class ArrayEx04 {
    public static void main(String[] args) {
        // 기본 자료형 변수
        int a1 = 10;
        int a2 = a1;

        System.out.println( a1 );
        System.out.println( a2 );
        
        // a2 값을 바꿔주면 값이 a2만 바뀜
        a2 = 20;
        System.out.println( a1 );
        System.out.println( a2 );
        
        // 참조 자료형 변수 = 참조변수 / 객체변수 / instance
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = arr1;
        System.out.println( arr1[0] );
        System.out.println( arr2[0] );

        // 하지만 배열 값을 바꿔주면 값이 위 아래 동시에 바뀜
        arr2[0] = 100;
        System.out.println( arr1[0] );
        System.out.println( arr2[0] );
        
    }
}