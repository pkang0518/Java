public class MainEx04 {
    public static void main (String[] args) {
        System.out.println( args.length );
        for( String arg : args ) {
            System.out.print( arg + "\t");
        }
        System.out.println();
    }
}