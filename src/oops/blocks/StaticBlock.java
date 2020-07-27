package oops.blocks;

public class StaticBlock {
// valid till 1.6
    static{
        System.out.println( "Without main method" );
        System.exit( 0 ); // if this line is not there we get exception no such method(java.lang.NoSuchMethodError.Main)
    }


}
