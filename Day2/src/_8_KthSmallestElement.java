public class _8_KthSmallestElement {
    static int partition(int[] arr, int l, int r, int k){
        int i=-1, j=0, pivot=arr[r];
        while (j<r){
            if (arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i+1, j);
        return i+1;
    }
    static void swap(int[] arr, int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    static int quickSelect(int[] arr, int l,int r, int k){
        int p=partition(arr, l, r, k);
        if (p+1==k)
            return arr[p];
        else if(p+1>k)
            return quickSelect(arr, l, p-1,k);
        else
            return quickSelect(arr, p+1, r, k);
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        //By using quick select algorithm
        return quickSelect(arr, l, r, k);

        //Time: O(n)

        //Method 2: do sort and return the kth element
        // Time: O(n)

        //Method 3: By using Max heap or min heap

    }
}
