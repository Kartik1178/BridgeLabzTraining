/*
 * Heap Sort Implementation
 *
 * This class sorts salary demands using the Heap Sort algorithm.
 * It first builds a Max Heap and then repeatedly extracts the
 * largest element and rebuilds the heap.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * Stable: No
 */

class HeapSort{
    // Sorts the array using heap sort by building max heap and extracting elements
    static void heapSort(int[] arr){
        int n=arr.length;

        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }
    }

    // Maintains max heap property for subtree rooted at index i
    static void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }

        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }
    }
    //main method for testing
    public static void main(String[] args){
        int[] arr={50000,30000,70000,45000,60000};
        heapSort(arr);
        for(int x:arr){
            System.out.println(x);
        }
    }
}
