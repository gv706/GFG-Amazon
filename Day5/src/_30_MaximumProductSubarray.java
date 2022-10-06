public class _30_MaximumProductSubarray {
    long maxProduct(int[] arr, int n) {
        long max_overall=arr[0];
        long max_ending_here=arr[0], min_ending_here=arr[0];

        for (int i=1;i<arr.length;i++){
            long tmp=max_ending_here;
            max_ending_here=Math.max(arr[i],
                    Math.max(arr[i]*max_ending_here, arr[i]*min_ending_here));
            min_ending_here=Math.min(arr[i],
                    Math.min(arr[i]*tmp, arr[i]*min_ending_here));

            max_overall=Math.max(max_overall, max_ending_here);
        }

        return max_overall;

        //Time: O(n)
        //Space: O(1)

        //method2: By checking all subarrays and find the max product which is of O(n^2)
    }
}
