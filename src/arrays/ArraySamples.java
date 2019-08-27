package arrays;

import java.util.*;

public class ArraySamples {
    int[] arr = {300, 476, 9, 0, 4, 5, 76};
    int[] brr = {50, 40, 67, 54};

    void doSort() { //sorting
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println( i );
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println( "ss" + arr[i] );

        }
    }

    void doMerge() { //use either list or a temp variable
        int[] temp = new int[arr.length + brr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
            count++;
        }
        for (int i = 0; i < brr.length; i++) {
            temp[count++] = brr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println( temp[i] );
        }
        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};
        List list = new ArrayList( Arrays.asList( a ) );
        list.addAll( Arrays.asList( b ) );
        Object[] c = list.toArray();
        System.out.println( Arrays.toString( c ) );
    }

    public static int removeDuplicateElements(int arr[], int n) {//use set or sort & use index
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;//for next element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];

            }
        }
        System.out.println( "j" + j++ + "arr[j++]" + arr[j++] + "n-1" + arr[n - 1] );
        arr[j++] = arr[n - 1];
        System.out.println( "arr[j++]" + arr[j++] + "j" + j );

        return j;
    }

    public void findDuplicates(int[] crr) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < crr.length - 1; i++) {
            if (crr[i] == crr[i + 1]) {
                crr[j++] = crr[i];
                System.out.println( "duplicate element" + crr[j] );
            }
        }
    }

    public void addArrays(int a[], int b[]) {

        int l1 = a.length, l2 = b.length;
        int temp[] = {};

        if (l1 == l2) {

            temp = new int[l1];

            for (int i = 0, j = 0; i < l1 & j < l2; i++, j++) {
                temp[i] = a[i] + b[j];
            }
            System.out.println( "Array Addition" );
            dispArray( temp );

        } else if (l1 > l2) {
            int k = l1 - l2;
            System.out.println( "case 2" );
            temp = new int[l1];
            int f = 0;
            for (int i = 0, j = 0; i < l1 || j < l2; i++, j++) {
                if (j >= l2) {
                    temp[i] = a[i];
                } else {
                    temp[i] = a[i] + b[j];
                }

            }
            System.out.println( "Array Addition " );
            dispArray( temp );
        }

    }

    private void dispArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println( temp[i] );
        }
    }

    public void getDuplicatesWithCount(int[] crr) {
        Set a = new LinkedHashSet<>();
        for (int i = 0; i < crr.length; i++) {
            for (int j = i + 1; j < crr.length; j++) {
                if (crr[i] == crr[j]) {
                    a.add( crr[i] );
                }
            }
        }
        System.out.println( "Duplicates" + a + "count" + a.size() );


    }

    /*1.Use temporary array & iterate it from last element*
    2.Dont Change array but swap first element with last element & second element with last but 1...
     */
    public void reverseArray(int[] arr1) {
        int k = arr1.length;
        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[k - 1] = arr1[i];
            k = k - 1;
        }
        System.out.println( "After Reversing Elemenst" );
        dispArray( arr2 );
        // Swap
        int temp;
        for (int i = 0; i < arr1.length / 2; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }
        dispArray( arr1 );

        /*ArrayList als = new ArrayList( Arrays.asList( arr1 ) );
        System.out.println( "als" + als );
        Collections.reverse( als );
        for (al:
             als) {

        }
        Integer[] integers = (Integer[]) als.toArray();
        Object arr3[] = als.toArray();
        for (int a : arr1) {
            System.out.println( "aaa" + a );
        }
        Collections.reverse( Arrays.asList( arr1 ) );

        System.out.println( "reversed" + Arrays.asList( arr1 ) )*/
        ;

    }

    public int getSecondLargestElement(int[] arr1) {
       /* for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) { // sort in ascending order
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }*/
        System.out.println( "Array Elements before " );
        dispArray( arr1 );
        sortInAscendingOrder( arr1 );
        return arr1[1];
    }

    public void sortInAscendingOrder(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) { // sort in ascending order
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println( "Array Elements after sorting in Ascending Order" );
        dispArray( arr1 );
    }

    public void sortInDesscendingOrder(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) { // sort in Descending  order
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println( "Array Elements after sorting in Descending Order" );
        dispArray( arr1 );
    }

}
