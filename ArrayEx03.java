public class ArrayEx03 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        for( int i=0 ; i<arr.length ; i++ ) {
            System.out.println( arr[i] );
        }

        // 향상된 for문
        for( int data : arr ) {
            System.out.println( data );
        }

        System.out.println( arr[0] );
        
        // 실행 시 발생할 수 있는 에러 : exception(예외)
        System.out.println( arr[3] );  // 에러 ArrayIndexOutOfBoundsException : 3 3번이 없는데 3을 출력하려고 하면 에러

    }
}