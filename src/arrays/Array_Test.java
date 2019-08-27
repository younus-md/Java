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
        aSample.findDuplicates( crr );
        aSample.getDuplicatesWithCount( crr );
        aSample.reverseArray( arr1 );
        aSample.sortInAscendingOrder( arr1 );
        aSample.sortInDesscendingOrder( arr1 );
        int secondLargest = aSample.getSecondLargestElement( arr1 );
        System.out.println( "secondLargest" + secondLargest );
        Arrays.sort( crr );
        int length = crr.length;
        length = removeDuplicateElements( crr, length );// uses a temp array
        length = aSample.removeDuplicateElements( crr, length );// uses an extra index

        System.out.println( "length" + length );

        //printing array elements
        System.out.println( "Removing Duplicates" );
        for (int i = 0; i < length; i++) {
            System.out.print( crr[i] );
        }
        //aSample.addArrays( arr1, arr2 );

    }

    /* Use a Temporary Array*/
    private static int removeDuplicateElements(int[] crr, int length) {
        if (length == 0 || length == 1) {
            return length;
        }

        int temp[] = new int[length];
        int j = 0;

        for (int i = 0; i < length - 1; i++) {
            if (crr[i] != crr[i + 1]) {
                temp[j++] = crr[i];
            }
        }
        System.out.println( "j" + j );
        temp[j++] = crr[length - 1];
        for (int i = 0; i < j; i++) {
            crr[i] = temp[i];
        }

        return j;
    }

}
