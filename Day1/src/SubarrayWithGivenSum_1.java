import java.util.ArrayList;

public class SubarrayWithGivenSum_1 {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        //using sliding window technique
        int curr_sum=0, start=0;
        ArrayList<Integer> res=new ArrayList<>();
        if (s==0){
            res.add(-1);
            return       res;
        }
        for (int i=0;i<n;i++){
            curr_sum+=arr[i];
            while (curr_sum>s){
                curr_sum-=arr[start];
                start++;
            }
            if (curr_sum==s){
                res.add(start+1);
                res.add(i+1);
                return res;
            }
        }
        res.add(-1);
        return res;
        //Time: O(n)
    }

    static ArrayList<Integer> method1(int[] arr, int n, int s){
        //By using two loops
        ArrayList<Integer> res=new ArrayList<>();
        if (s==0){
            res.add(-1);
            return res;
        }
        int curr_sum;
        for (int i=0;i<n;i++){
            curr_sum=arr[i];
            if (curr_sum==s){
                res.add(i+1);
                res.add(i+1);
                return res;
            }
            for (int j=i+1;j<n;j++){
                curr_sum+=arr[i];
                if (curr_sum==s){
                    res.add(i+1);
                    res.add(j+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
        //Time: O(n^2)
    }
}
