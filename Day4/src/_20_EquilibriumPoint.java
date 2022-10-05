public class _20_EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        long rightSum=0, leftSum=0;
        for(int i=0;i<n;i++){
            rightSum+=arr[i];
        }

        for(int i=0;i<n;i++){
            rightSum-=arr[i];
            if(rightSum==leftSum){
                return i+1;
            }
            else{
                leftSum+=arr[i];
            }
        }
        return -1;

        //Time: O(n)
        //Space: O(1)
    }
}
