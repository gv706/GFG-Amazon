public class _29_TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        long trap=0;

        /*int[] left=new int[n],  right=new int[n];

        left[0]=0;
        right[n-1]=0;

        int lm=arr[0], rm=arr[n-1];


        for(int i=1;i<n;i++){
            left[i]=lm;
            lm=Math.max(lm, arr[i]);
        }

        for(int i=n-2;i>=0;i--){
            right[i]=rm;
            rm=Math.max(rm, arr[i]);
        }

        for(int i=0;i<n;i++){
            int wl=Math.min(left[i], right[i]);
            if(arr[i]<wl)
                trap+=(wl-arr[i]);
        }
        return trap;*/
        //Time: O(n)
        //Space: O(n)


        //method2
        int lm=arr[0], rm=arr[n-1];
        int left=0, right=n-1;
        while(left<=right){
            if(lm<rm){
                if(arr[left]>=lm)
                    lm=arr[left];
                else
                    trap+=lm-arr[left];
                left++;
            }
            else{
                if(arr[right]>=rm)
                    rm=arr[right];
                else
                    trap+=rm-arr[right];
                right--;
            }
        }

        return trap;

        //Time: O(n)
        //Space: O(1)
    }
}
