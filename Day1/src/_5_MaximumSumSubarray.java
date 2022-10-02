public class _5_MaximumSumSubarray {
    long maxSubarraySum(int arr[], int n){
        //kadanes's algorithm
        long max_current=arr[0], max_global=arr[0];
        for (int i=1;i<arr.length;i++){
            max_current=Math.max(max_current+arr[i], arr[i]);
            if (max_current>max_global)
                max_global=max_current;
        }

        return max_global;
        //Time: O(n)
    }

}
