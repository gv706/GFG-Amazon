public class MinimumNumberOfJumps_2 {
    static int minJumps(int[] arr){
        int n=arr.length;
        if (n==1)
            return 0;
        if (arr[0]==0)
            return -1;
        int maxReach=arr[0], jumps=1, step=arr[0];
        /*for (int i=1;i<n;i++){
            if (i==n-1)
                return jumps;
            maxReach=Math.max(maxReach, i+arr[i]);
            step--;
            if (step==0){
                jumps++;
                if (i>=maxReach)
                    return -1;
                step=maxReach-i;
            }
        }*/

        for (int i=1;i<n-1;i++){
            maxReach=Math.max(maxReach, i+arr[i]);
            step--;
            if (step==0){
                jumps++;
                if (i>=maxReach)
                    return -1;
                step=maxReach-i;
            }
        }

        return jumps;
        //Time: O(n)
        //Space: O(1)
    }

    static int method(int[] arr){
        //using Dynamic Programming
        int n=arr.length;
        if (n==1)
            return 0;
        if (arr[0]==0)
            return -1;
        int[] jumps=new int[n];

        for (int i=1;i<n;i++){
            jumps[i]=Integer.MAX_VALUE;
            for (int j=0;j<i;j++){
                if (j+arr[j]>=i && jumps[j]!=Integer.MAX_VALUE){
                    jumps[i]=Math.min(jumps[j]+1, jumps[i]);
                    break;
                }
            }
        }
        if (jumps[n-1]==Integer.MAX_VALUE)
            return -1;
        return jumps[n-1];

        //Time: O(n^2)
        //Space: O(n)
    }
}
