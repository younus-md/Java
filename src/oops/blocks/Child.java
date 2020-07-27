package oops.blocks;

/**
 * @author $yed
 */
public class Child extends  Parent {
    static int y=30;
    static{
        m2();
    }

    public static void main(String [] args){
        m2();
        System.out.println( "Child Main" );

    }

    private static void m2() {
        System.out.println(k  );
    }
    static int k =25;
    static{
//        m2();
        System.out.println( "Static block 2" );
    }

}
