package java8;

import com.sun.org.apache.bcel.internal.generic.LMUL;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main implements DefaultMethods {

    @Override
    public void doSomething() {
        System.out.println( "From Implementation class" );
    }

    public static void main(String[] args) {

        AdditionInterface a = (c, b) -> System.out.println( "Welcome To Lambda &the sum is" + (c + b) );
        a.add( 10, 20 );
        a.add( 20, 50 );
        LambdaFeature lambdaFeature = new LambdaFeature();
        lambdaFeature.implementRunnableUsingLambda();
        lambdaFeature.sortUsingLamda();
        Main main = new Main();
        main.doSomething(); // directly calling default method of interface
        DefaultMethods.iamStatic();// only way to call a static method we can also call main method in interface

        Test test = new Test();
        test.goToGym();
        /* Predicate : used for conditional checks replacement of if else statements write once use many times
        use cases: null checks string length .. returns true or false*/

        Predicate<Integer> predicate = num -> (num % 2) == 0;
        System.out.println( predicate.test( 14 ) );
        System.out.println( predicate.test( 15 ) );
        /* Lets print all elements whose length > 4*/
        String[] str = {"syed", "mohammed", "javeed"};
        Predicate<String> predicate1 = str1 -> str1.length() > 4;

        for (String s : str) {
            if (predicate1.test( s )) {

                System.out.println( "elements" + s );
            }
        }
        /*Applying Predicate on our own Custom class*/
        ArrayList<SoftwareEngineer> softwareEngineers = new ArrayList<SoftwareEngineer>();
        softwareEngineers.add( new SoftwareEngineer( 45000, "Iliyas" ) );
        softwareEngineers.add( new SoftwareEngineer( 4000, "Iliyas" ) );
        softwareEngineers.add( new SoftwareEngineer( 5000, "Vamsi" ) );
        softwareEngineers.add( new SoftwareEngineer( 45100, "Javeed" ) );
        softwareEngineers.add( new SoftwareEngineer( 34440, "Shasha" ) );
        Predicate<SoftwareEngineer> softwareEngineerPredicate = sfe -> sfe.salary > 45000;
        for (SoftwareEngineer al : softwareEngineers) {
            if (softwareEngineerPredicate.test( al )) {
                System.out.println( al.name
                );

            }
            /*Predicate Joining : we can combine two predicates by and  or negate */
            int x[] = {40, 70, 45, 6, 7, 1000};
            Predicate<Integer> p1 = num -> (num % 10) == 0;
            Predicate<Integer> p2 = num -> num > 40;
            for (int x1 : x) {
                if (p1.and( p2 ).test( x1 )) {
                    System.out.println( x1 );
                }
            }
            /*Function Interface*/
            Function<Integer, Integer> f = i -> i * i;
            System.out.println( f.apply( 7 ) );

            /*Streams*/
            StreamSample streamSample = new StreamSample();
            streamSample.doStreamCreation();
            streamSample.intermediateOperators();
            streamSample.doTerminalOperations();


        }

    }
}
