/*
 * QuickSort Implementation (Hoare Partition Scheme)
 *
 * This class implements the Quick Sort algorithm using Hoare's partition method.
 * QuickSort is a divide-and-conquer algorithm that:
 * 1. Selects a pivot element
 * 2. Partitions the array around the pivot
 * 3. Recursively sorts left and right partitions
 *
 * Average Time Complexity: O(n log n)
 * Worst Case: O(n^2)
 * Space Complexity: O(log n) (recursive stack)
 * Not Stable
 */
class QuickSort{
    // Recursively sorts the array by partitioning around a pivot
    static void quickSort(int[] arr,int low,int high){
        if(low<high) {
            int pivot = partition(low, high, arr);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot+1, high);
        }}
    // Partitions the array using Hoare's scheme and returns partition index
    static int partition(int low,int high,int[] arr){
        int i=low-1;
        int j=high+1;
        int partition=arr[low];
        while(true){
            do{
                i++;
            }while(arr[i]<partition);
            do{
                j--;
            }while(arr[j]>partition);
            if(i>=j){
                return j;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    //Main function for testing the sorting algorithm
    public static void main(String[] args){
        int[] arr={5,3,6,3,5,1,3,7,7,3,52,4};
        quickSort(arr,0,arr.length-1);
        for(int x:arr){
            System.out.println(x);
        }


    }


}
