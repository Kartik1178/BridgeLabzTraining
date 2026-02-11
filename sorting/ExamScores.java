/*
 * Selection Sort Implementation
 *
 * This class sorts students' exam scores in ascending order using
 * the Selection Sort algorithm. The algorithm repeatedly finds the
 * minimum element from the unsorted portion and places it at the beginning.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Stable: No
 */

class SelectionSort{
    // Sorts the array by repeatedly selecting the minimum element and swapping it to correct position
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    public static void main(String[] args){
        int[] arr={78,45,90,66,55};
        selectionSort(arr);
        for(int x:arr){
            System.out.println(x);
        }
    }
}
