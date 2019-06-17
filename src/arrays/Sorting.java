package arrays;

public class Sorting {

        void doSort(){
            int arr[]={88,7,4,8,59,2,34};
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length-1;j++){
                    if(arr[i]>arr[j]){
                        int temp= arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }

            }
            for(int i=0;i<arr.length-1;i++){
                System.out.println(arr[i]);
            }
        }

        





}
