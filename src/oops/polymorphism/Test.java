package oops.polymorphism;

public class Test {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.add( 'z' );// it will be promoted to integer so ascii value of a i,e 122 will be passed
        o.add( 15 );
        //o.add( null );// it calls String argumented add method not object argumented add method because child has high priority
        //o.add( 3, 3 ); // ambigous method call
        // overriding
        Person person = new SofwareEngineer(); // parent refernce can be used to child object
        person.eat(); // here eat method of SoftwareEngineer will be called
        person.drink();// here drink method of Person will be called as we are not overriding it in SoftwareEngineer

    }
}
