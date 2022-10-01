public class MissingNumberInAnArray_3 {
    int MissingNumber(int a[], int n) {
        int xor=0;

        for(int i=0;i<n-1;i++){
            xor^=a[i];
        }
        for(int i=1;i<=n;i++){
            xor^=i;
        }
        return xor;
        //Time: O(n)
        //Space: O(1)
    }
}
