package oops.polymorphism;

public class Person {
    public void eat() {
        System.out.println( "A Person can eat anything which is eatable except other Person's head" );
    }

    public void drink() {
        System.out.println( "A person has a choice to drink soft/hard drinks" );
    }

    private void work() {
        System.out.println( "A Person has to work to earn his bread" );
    }
}
