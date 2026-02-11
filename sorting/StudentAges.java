/*
 * Counting Sort Implementation
 *
 * This class sorts student ages (range 10–18) using Counting Sort.
 * It counts occurrences, computes cumulative counts, and places
 * elements in correct positions.
 *
 * Time Complexity: O(n + k)
 * Space Complexity: O(k)
 * Stable: Yes
 */

class CountingSort{
    // Sorts the array using counting sort based on frequency counting
    static void countingSort(int[] arr){
        int max=18;
        int min=10;
        int range=max-min+1;

        int[] count=new int[range];
        int[] output=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            count[arr[i]-min]++;
        }

        for(int i=1;i<range;i++){
            count[i]+=count[i-1];
        }

        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]-min]-1]=arr[i];
            count[arr[i]-min]--;
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args){
        int[] arr={12,15,10,18,14,12,11};
        countingSort(arr);
        for(int x:arr){
            System.out.println(x);
        }
    }
}
