public class ArrayEx07 {
    public static void main(String[] args) {

        // 가변 배열
        int[][] arrs = new int[3][];

        // 열의 갯수가 다른 행으로 생성
        arrs[0] = new int[3];
        arrs[1] = new int[2];
        arrs[2] = new int[1];

        for( int row=0 ; row<arrs.length ; row++ ) {
            System.out.println( arrs[row].length );
        }

        // 초기화
        int[][] arr2 = { {10
        , 20, 30}, {40, 50, 60}, { 60 } };

        for( int[] cols : arr2 ) {
            for( int data : cols ) {
                System.out.print( data + "\t" );
            }
            System.out.println();
        }
    }
}