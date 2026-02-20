import java.util.Deque;
import java.util.ArrayDeque;
/* implementing the sliding window maximum problem*/
class SlidingWindowMaximum{

    /* method for returning an array with the maximum numbers of each subarray*/
static int[] maxSlidingWindow(int[] arr,int k){

int n=arr.length;
int[] res=new int[n-k+1];
Deque<Integer> dq=new ArrayDeque<>();
int index=0;
for(int i=0;i<n;i++){
    while(!dq.isEmpty() && dq.peekFirst()<i-k){
        dq.pollFirst();
    }
    while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
        dq.pollLast();
    }
    dq.offerLast(i);

    if(i>=k-1){
        res[index++]=nums[dq.peekFirst()];
    }

}

return res;

}
    //main method for testing
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = maxSlidingWindow(nums, k);

        System.out.print("Sliding Window Maximums: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

}