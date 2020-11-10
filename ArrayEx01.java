public class ArrayEx01 {
    public static void main(String[] args) {
        // 배열의 선언 방법 2가지 (의미는 같음)
        int[] arr1;
        int arr2[];

        // 배열의 생성
        arr1 = new int[10];

        // 초기화
        arr1[0] = 10;
        arr1[1] = 30;
        arr1[2] = 50;

        System.out.println( arr1 ); // 출력값 : [I@15db9742 <= 참조값(위치메모리)
        System.out.println( arr1[0] );
        System.out.println( arr1[1] );
        System.out.println( arr1[2] );
          
    }
}