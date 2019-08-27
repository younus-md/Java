package arrays;

import java.util.Arrays;

public class Array_Test {

    public static void main(String[] args) {

        //Arrays
        ArraySamples aSample = new ArraySamples();
        int[] crr = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 1};
        int[] arr1 = {32, 45, 56, 90, 65};
        int arr2[] = {4, 0, 87};
        aSample.doMerge();
        Arrays.sort( crr );
        aSample.findDuplicates( crr );
        aSample.getDuplicatesWithCount( crr );
        aSample.reverseArray( arr1 );
        aSample.sortInAscendingOrder( arr1 );
        aSample.sortInDesscendingOrder( arr1 );
        int secondLargest = aSample.getSecondLargestElement( arr1 );
        System.out.println( "secondLargest" + secondLargest );
        int length = crr.length;
        // length = aSample.removeDuplicateElements( crr, length );
        System.out.println( "ll" + length );

        //printing array elements
        for (int i = 0; i < length; i++) {
            System.out.print( crr[i] );
        }
        //aSample.addArrays( arr1, arr2 );

    }
}
