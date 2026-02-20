/*
 * Bubble Sort Implementation
 *
 * This class sorts an array using the Bubble Sort algorithm.
 * Bubble Sort repeatedly compares adjacent elements and swaps them
 * if they are in the wrong order. After each pass, the largest
 * unsorted element "bubbles" to its correct position.
 *
 * Time Complexity:
 * Best Case: O(n)
 * Worst Case: O(n^2)
 *
 * Space Complexity: O(1)
 * Stable: Yes
 */

class StudentMarks{
    // Sorts the array by repeatedly swapping adjacent elements if they are in the wrong order
    static void bubbleSort(int[] arr){
        int n=arr.length-1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    //Main method   for testing the sorting algorithm
    public static void main(String[] args){
        int[] arr={4,6,42,1,3};
        bubbleSort(arr);
        for(int x:arr){
            System.out.println(x);
        }

    }

}
