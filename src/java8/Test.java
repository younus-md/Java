package java8;

public class Test implements Interf2, Interf1 {
    @Override
    public void goToGym() {
        System.out.println( "Our Own Implementation" );
        Interf2.super.goToGym();// calls method from Interf2
        Interf1.super.goToGym();// calls method from Interf1
    }
}
