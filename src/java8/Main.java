package java8;

import com.sun.org.apache.bcel.internal.generic.LMUL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main implements DefaultMethods {

    @Override
    public void doSomething() {
        System.out.println( "From Implementation class" );
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 100; i < 6; i++) {
            list1.add( i );
        }

        AdditionInterface a = (c, b) -> System.out.println( "Welcome To Lambda &the sum is" + (c + b) );
        a.add( 10, 20 );
        a.add( 20, 50 );
        LambdaFeature lambdaFeature = new LambdaFeature();
        lambdaFeature.implementRunnableUsingLambda();
        lambdaFeature.sortUsingLamda();
        new Thread( () -> {
            System.out.println( "New Thread" );
            System.out.println( "Thread 1" );
        } ).start(); // Thread Creation

        Main main = new Main();
        main.doSomething(); // directly calling default method of interface
        DefaultMethods.iamStatic();// only way to call a static method we can also call main method in interface

        Test test = new Test();
        test.goToGym();
        /* Predicate : used for conditional checks replacement of if else statements write once use many times takes one parameter
        use cases: null checks string length .. returns true or false*/
        System.out.println( "=========Predicate============" );
        Predicate<Integer> predicate = num -> (num % 2) == 0;
        System.out.println( predicate.test( 14 ) );
        System.out.println( predicate.test( 15 ) );
        // Chaining of Predicates
        Predicate<Integer> greaterThan30 = num -> num > 30;
        Predicate<Integer> lessThan30 = num -> num < 30;
        System.out.println( greaterThan30.test( 44 ) );
        System.out.println( lessThan30.test( 14 ) );
        System.out.println( greaterThan30.and( lessThan30 ).test( 90 ) );

        /* Lets print all elements whose length > 4*/
        String[] str = {"syed", "mohammed", "javeed"};
        Predicate<String> predicate1 = str1 -> str1.length() > 4;

        for (String s : str) {
            if (predicate1.test( s )) {

                System.out.println( "elements" + s );
            }
        }
        /*Applying Predicate on our own Custom class*/
        List<SoftwareEngineer> softwareEngineers = new ArrayList<>();
        softwareEngineers.add( new SoftwareEngineer( 45000, "Iliyas" ) );
        softwareEngineers.add( new SoftwareEngineer( 30000, "Younus" ) );
        softwareEngineers.add( new SoftwareEngineer( 50000, "Vamsi" ) );
        softwareEngineers.add( new SoftwareEngineer( 45100, "Javeed" ) );
        softwareEngineers.add( new SoftwareEngineer( 39440, "Shasha" ) );
        softwareEngineers.add( new SoftwareEngineer( 64440, "Murali" ) );

        getSoftwareEngineersByPredicate( softwareEngineers, "Salary above 45000", sfe -> sfe.salary > 45000 );

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
            System.out.println( "=========Predicate Ends============" );

            /*Function Interface*/
            System.out.println( "=========Function============" );
            Function<Integer, Integer> f = i -> i * i;
            System.out.println( "pply" + f.apply( 7 ) );
            System.out.println( "=========Function Ends============" );

            // Streams
            System.out.println( "=========Streams============" );
            Comparator<Integer> num = Streams::compareByNumber; // Uisng static Method refernce to compare two Integer Object
            System.out.println( "using Static Method Reference" + num );
            Streams.demoStreams();
            Stream<String> rnStr = Stream.of( "abc", "def", "ghi" );
            Stream<String> rnStr1 = Stream.of( "65", "pdef", "gh090i" );
            Stream.concat( rnStr, rnStr1 ).distinct().peek( System.out::println );
            Streams.demoFlatMap();
            System.out.println( "=========Streams End============" );

            System.out.println( "=========Lambda Challenges============" );
            lambdaFeature.splitString(); // use lamba
            String s = doProcessString( "Syed Mohammed Younus" );

            Function<String, String> strFun = l -> {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < l.length(); i++) {
                    if (i % 2 == 1) {
                        sb.append( l.charAt( i ) );
                    }
                }
                return sb.toString();
            };
            System.out.println( "invoking doProcessStringWith Lambda:::" + strFun.apply( "012345678" ) );
            String res = writeAboveCodeAsMethod( strFun, "012345678" );
            System.out.println( "Writing in a seperate Method:::" + res );
        }

        Supplier<String> iamSupplier = () -> "I am Supplier";
        String supRes = iamSupplier.get();
        System.out.println( "supplier" + supRes );
        Streams.sortNamesByMakingStartingLetterCapital();

    }

    private static String writeAboveCodeAsMethod(Function<String, String> strFun, String s) {
        return strFun.apply( s );
    }

    private static String doProcessString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                sb.append( str.charAt( i ) );
            }
        }
        return sb.toString();
    }

    private static void getSoftwareEngineersByPredicate(List<SoftwareEngineer> softwareEngineers, String s, Predicate<SoftwareEngineer> sfe) {

        System.out.println( s );
        System.out.println( "=============================" );
        for (SoftwareEngineer se : softwareEngineers) {
            if (sfe.test( se )) {
                System.out.println( "Namee" + se.name );
            }
        }
        System.out.println( "=============================" );

    }

}
