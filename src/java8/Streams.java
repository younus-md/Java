package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;

/**
 * @author $yed
 */
public class Streams {

    /*
        using stream get all the names that start with s

        '::' -> Method references are a special type of lambda expressions.
        They're often used to create simple lambda expressions by referencing existing methods. 4 types
        Static method reference : When you refer to the static method of Containing a class,
        ex: ClassName::someStaticMethodName
        Instance method reference of a particular object
        Instance method reference of an arbitrary object of a particular type :When you refer to the instance method of a class with the ClassName , you will get
        the instance method reference of an arbitrary object of a particular type,
        ex: asClassName::someInstanceMethod; (String :: toUpperCase)
        Constructor reference : When you refer to a constructor of a class in lambda, you will get a constructor reference,
        ex: ClassName::new.

        Streams cant be reused once the terminal operations. Illegal State Exception is thrown when u try to operate again. Lazily operated
        Parallel Streams can be used to increase performance
    */
    static List<String> demoStreams() {
        List<String> randomNames = Arrays.asList(
                "Syed Moha", "Sufi Saint", "Shiya",
                "Anser", "Munna", "Iliyas", "Imtiyaz",
                "safi", "saif", "Saddu", "sardar"
        );
        // map -expect two params
        randomNames.stream().map( String::toUpperCase ).filter( s -> s.startsWith( "S" ) ).sorted().forEach( System.out::println );
        return randomNames.stream().map( s -> s.toUpperCase() ).filter( s -> s.startsWith( "S" ) ).sorted().collect( Collectors.toList() );
    }

    public static int compareByNumber(Integer se1, Integer se2) {
        return Integer.compare( se1, se2 );
    }


    /*
        used to flatten a stream of collections to a stream of elements combined from all collections.
        The flatMap() operation has the effect of applying a one-to-many transformation to the elements of the stream,
         and then flattening the resulting elements into a new stream.
         It converts Collection<Collection<T>> to Collection <T>
         An intermediate operation that returns a stream
    */
    static void demoFlatMap() {

        List<Integer> list1 = Arrays.asList( 1, 2, 3 );
        List<Integer> list2 = Arrays.asList( 4, 5, 6 );
        List<Integer> list3 = Arrays.asList( 7, 8, 9 );
        List<List<Integer>> listOfLists = Arrays.asList( list1, list2, list3 );
        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap( x -> x.stream() )
                .collect( Collectors.toList() );
        System.out.println( "flatMap" + listOfAllIntegers );


    }

    public static void sortNamesByMakingStartingLetterCapital() {

        List<String> names = Arrays.asList( "Aaksh", "dada", "bobby", "Nutella", "Cat", "adarsh", "Ajay" );

        List<String> sortedNames = names.stream().map( name -> getName( name ) ).sorted().collect( Collectors.toList() );//using streams
        System.out.println( "Sorted Names Using Lambda...." + sortedNames );
        List<String> nameList = new ArrayList<>();
        names.forEach( name -> nameList.add( name.substring( 0, 1 ).toUpperCase() + name.substring( 1 ) ) );
        nameList.sort( String::compareTo );  //(s1, s2) -> s1.compareTo( s2 )
        nameList.forEach( nam -> System.out.println( nam ) );
        //peek only works with terminal operation
        List<String> usingMap = names.stream().map( name -> name.substring( 0, 1 ).toUpperCase() + name.substring( 1 ) ).peek( System.out::println ).sorted().collect( Collectors.toList() );//using streams
        List<String> specificA = names.stream().map( name -> name.substring( 0, 1 ).toUpperCase() + name.substring( 1 ) ).filter( name -> name.startsWith( "A" ) ).sorted().collect( Collectors.toList() );//using streams
        System.out.println( specificA.size() );
    }

    private static String getName(String name) {

        String newName = "";
        System.out.println( "names" + name );
        char ch = name.charAt( 0 );
        if (Character.isUpperCase( ch ))
            return name;
        else {
            ch = Character.toUpperCase( ch );
            int len = name.length();
            newName = ch + name.substring( 1, len );
            return newName;
        }
    }


}
