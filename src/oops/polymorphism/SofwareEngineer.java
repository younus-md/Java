package oops.polymorphism;

public class SofwareEngineer extends Person {
    @Override
    public void eat() {
        //  super.eat();
        System.out.println( "A software Engineer mostly eat Pizza" );
    }

    @Override
    public void drink() {
        super.drink();
    }

    // cant override private method but can have same method
    public void work() {
        System.out.println( "A Se has to code for his bread" );
    }
}
