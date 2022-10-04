public class _18_PeakElement {
    static int binarySearch(int[] arr, int low, int high, int n){

        int mid = low + (high - low) / 2;
        if ((mid == 0 || arr[mid - 1] <= arr[mid])
                && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return binarySearch(arr, low, (mid - 1), n);
        else
            return binarySearch(
                    arr, (mid + 1), high, n);

        //Time: O(logn)
        //Space: O(1)

        //method 2: By traversing all the elements and checking left and right neighbors
    }
    public int peakElement(int[] arr,int n) {
        return binarySearch(arr,0, n-1, n);
    }
}
