package oops.blocks;

/**
 * @author $yed
 */
public class InstannceChildBlock extends InstanceBlock {

    int k = 90;

    {
        k2();
    }

    InstannceChildBlock() {
        System.out.println( "child constru" );
        k2(); // h =50
    }

    public static void main(String args[]) {

        InstannceChildBlock ins = new InstannceChildBlock();
        InstannceChildBlock ins1 = new InstannceChildBlock();

        System.out.println( "call from child main" );

    }

    private void k2() {
        System.out.println( h );
    }

    {
        System.out.println( "second blok" );
    }

    int h = 50;
}
