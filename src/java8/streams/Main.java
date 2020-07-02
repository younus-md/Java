package java8.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $yed
 */
public class Main {

    public static void main(String[] args) {
        /*Streams*/
        StreamSample streamSample = new StreamSample();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 100; i <107 ; i++) {
            list1.add( i );
        }
        streamSample.doStreamCreation();
        streamSample.intermediateOperators();
        streamSample.doTerminalOperations();
        streamSample.mapToInt( list1 );
        streamSample.sortWithStream();

    }


}
