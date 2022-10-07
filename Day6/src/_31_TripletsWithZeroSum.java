import java.util.Arrays;

public class _31_TripletsWithZeroSum {
    public boolean findTriplets(int arr[] , int n) {
        Arrays.sort(arr);
        for (int i=0;i<n-2;i++){
            int x=arr[i];
            int l=i+1, r=n-1;
            while (l<r){
                if (x+arr[l]+arr[r]==0)
                    return true;
                else if (x+arr[l]+arr[r]<0)
                    l++;
                else
                    r--;
            }
        }
        return false;

        //Time: O(n^2)
        // Space:O(1)

        //method 2: By using hashmap
        //method 3: By running three loops
    }
}
