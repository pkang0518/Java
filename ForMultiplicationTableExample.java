/*
public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for(int m=1; m<=9; m++) {
            for(int n=1; n<=9; n++) {
                System.out.print(m + " X " + n + "=" + (m*n) + " ");
            }
            System.out.println("");
        }
    }
}
*/

public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for(int dan=1; dan<=9; dan++) {
            for(int col=1; col<=9; col++) {
                System.out.print(dan + "X" + col + "=" + (dan*col) + "\t");
            }
            System.out.println();
        }
    }
}