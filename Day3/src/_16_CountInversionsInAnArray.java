public class _16_CountInversionsInAnArray {
    static long merge(long[] arr, int l, int m, int r){
        int n1=m-l+1, n2=r-m;
        long c=0;
        long[] lhalf=new long[n1];
        long[] rhalf=new long[n2];

        for (int i=0;i<n1;i++){
            lhalf[i]=arr[l+i];
        }

        for (int j=0;j<n2;j++){
            rhalf[j]=arr[m+1+j];
        }

        int i=0, j=0, k=l;
        while (i<n1 && j<n2){
            if (lhalf[i]<rhalf[j]){
                arr[k++]=lhalf[i++];
            }
            else {
                arr[k++]=rhalf[j++];
                c+=(n1-i);
            }
        }
        while (i<n1){
            arr[k++]=lhalf[i++];
        }
        while (j<n2){
            arr[k++]=rhalf[j++];
        }
        return c;
    }
    static long sort(long[] arr, int l, int r){
        long c=0;
        if (l<r) {
            int m = (l + r) / 2;
            c+=sort(arr, l, m);
            c+=sort(arr, m + 1, r);
            c+=merge(arr, l, m, r);
        }
        return c;
    }
    static long inversionCount(long arr[], long n)
    {
        int l=0, r=(int)n-1;
        return sort(arr, l, r);

        //Time: O(nlogn)
        //Space: O(n)

        //method 2: By running two loops and getting the count by checking the elements at i
        // and j positions
    }
}
