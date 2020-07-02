package java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
Intermediate Operators: map() filter () sort
Terminal Operators : collect() forEach() reduce*/
public class StreamSample {

    void doStreamCreation() {
        Stream<String> emptyStream = Stream.empty(); // emptyStream
        System.out.println( "Empty Stream" + emptyStream );
        Stream.of( 1, 2, 3, 4, 5, 6, 7, 8, 9 ).forEach( System.out::print ); // creates a stream of integers
        Collection<String> collection = Arrays.asList( "a", "b", "c" );
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach( s -> {
            System.out.println( "element" + s );
        } );
        Stream.iterate( 40, n -> n + 2 ).limit( 4 ).forEach( System.out::println ); // using Stream.iterate
        Stream.generate( () -> "syed" ).limit( 3 ).forEach( System.out::println );//using Stream.generate itprints 3 times syed
    }

    /*return the stream itself so you can chain multiple method calls in a row
     * filter():-accepts a predicate to filter all elements of the stream. This operation is intermediate which enables us to call another stream operation (e.g. forEach) on the result.
     * map():-map converts each element into another object via the given function
     * sorted()-returns a sorted view of the stream. The elements are sorted in natural order unless you pass a custom Comparator.*/
    void intermediateOperators() {
        List<String> names = names();
        System.out.println( "--Using filter ------------" );
        names.stream().filter( s -> s.startsWith( "S" ) )
                .forEach( System.out::println ); // forEach is actually a Terminal Operation
        List<Integer> ints = Arrays.asList( 1, 9, 2, 6, 5, 3, 7, 8, 4 );
        System.out.println( "--Using map----------" );
        ints.stream().map( x -> x * x ).forEach( x -> {
            System.out.println( x );
        } );
        System.out.println( "evens using filters" );
        ints.stream().filter( a -> a % 2 == 0 ).forEach( System.out::print );
        System.out.println( "--using sorted of stream----" );
        ints.stream().sorted().forEach( System.out::println );

    }


    /*Terminal operations return a result of a certain type instead of again a Stream.
       forEach()-helps in iterating over all elements of a stream and perform some operation on each of them. The operation is passed as lambda expression parameter.
       collect() -used to receive elements from a steam and store them in a collection and mentioned in parameter function.
       reduce()-This terminal operation performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.*/
    void doTerminalOperations() {
        List<Integer> ints = Arrays.asList( 1, 9, 2, 6, 5, 3, 7, 8, 4 );
        System.out.println( "Using forEach to iterate over elements" );
        ints.forEach( System.out::println );
        List<String> names = names();
        System.out.println( "-----Using Collector--" );
        names.stream().sorted().map( String::toUpperCase ).collect( Collectors.toList() ).forEach( System.out::println );
        int evens = ints.stream().filter( x -> x % 2 == 0 ).reduce( 0, (ans, i) -> ans + i );
        System.out.println( "even" + evens );

    }

    private List<String> names() {
        List<String> names = new ArrayList<>();
        names.add( "Iliyas" );
        names.add( "Shifa" );
        names.add( "Shashanna" );
        names.add( "Gautham" );
        names.add( "Nagraj" );
        names.add( "Basu" );
        names.add( "Salman" );
        names.add( "Bhasky" );
        names.add( "Khovawale" );
        names.add( "Younus" );
        return names;
    }

    public void mapToInt(List<Integer> list1) {
        int arr[] = list1.stream().mapToInt( a -> a ).toArray();
        iterateArr( arr );
        int sum = list1.stream().mapToInt( a -> a ).sum(); // sum of elements in a single step
        System.out.println( "sum" + sum );
        List<String> strList = generateStringList();
        int len = strList.stream().mapToInt( str -> str.length() ).sum();
        System.out.println( "sum of length" + len );
    }

    private List<String> generateStringList() {
        List<String> strList = new ArrayList<>( Arrays.asList( "Syed", "Mohammed", "Younus", "Capgemini" ) );
        return strList;
    }

    private void iterateArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] );
        }
    }

    public void sortWithStream() {
        List<String> strList = generateStringList();
        List<String> sortedList = strList.stream().sorted().collect( Collectors.toList() );
        sortedList.forEach( System.out::println );
        System.out.println( "Uisng Lambda" );
        List<String> sortedList1 = strList.stream().sorted( (o1, o2) -> o1.compareTo( o2 ) ).collect( Collectors.toList() );
        sortedList1.forEach( System.out::println );
        System.out.println( "In reverse Order" );
        List<String> revSortedList = strList.stream().sorted( Comparator.reverseOrder() ).collect( Collectors.toList() );
        revSortedList.forEach( System.out::println );

    }
}
