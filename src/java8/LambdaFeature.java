package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Lambda Expression: Any function that is written without any,modifiers & has no name is defined as lambda expression
curly braces are optional if there is only one line of code. We use Functional Interface to invoke LE
ex: to get square using lambda
(int number)->  number*number
number -> number *number if only one parameter is there then ( are) optional
To get length of string abc with labda abc->abc.length

Using Return :
n-> {return n+2;}; valid
n-> {return n+2} invalid because semicolon is missing
n-> {n+2;} invalid no semicolon needed
 * */
public class LambdaFeature {

    /* 1. Usage of Lambda in Thread Creation:
     The below method we use Lambda to instantiate a Thread using Runnable without implementing it using an extra class
     */
    void implementRunnableUsingLambda() {

        Runnable runnable = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println( "Child Thread " );
            }
        };
        Thread thread = new Thread( runnable );
        thread.start();

    }

    /*2. Usage of Lambda in Collections: As Comparator is a Functional Interface, we can use Lambda to sort array list elements
     */
    void sortUsingLamda() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add( 20 );
        arrayList.add( 50 );
        arrayList.add( 9 );
        arrayList.add( 21 );
        Comparator<Integer> comparator = (t1, t2) -> (t1 > t2) ? -1 : (t1 < t2) ? 1 : 0;
        Collections.sort( arrayList, comparator );
        System.out.println( "sorted arraylist" + arrayList );

        ArrayList<SoftwareEngineer> softwareEngineers = new ArrayList<SoftwareEngineer>();
        softwareEngineers.add( new SoftwareEngineer( 45000, "Iliyas" ) );
        softwareEngineers.add( new SoftwareEngineer( 4000, "Iliyas" ) );
        softwareEngineers.add( new SoftwareEngineer( 5000, "Vamsi" ) );
        softwareEngineers.add( new SoftwareEngineer( 45100, "Javeed" ) );
        softwareEngineers.add( new SoftwareEngineer( 34440, "Shasha" ) );
        Collections.sort( softwareEngineers, (softwareEngineer1, softwareEngineer2) -> (softwareEngineer1.salary > softwareEngineer2.salary) ? -1 : (softwareEngineer1.salary < softwareEngineer1.salary) ? 1 : 0 );
        System.out.println( "Software Engineer Sorting by salary " + softwareEngineers );
        Collections.sort( softwareEngineers, (softwareEngineer1, softwareEngineer2) -> (softwareEngineer1.name.compareTo( softwareEngineer2.name )) );
        System.out.println( "Software Engineer Sorting by names" + softwareEngineers );

    }


}
