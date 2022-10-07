public class _36_FindTransitionPoint {
    int transitionPoint(int arr[], int n) {
        int lb = 0, ub = n - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (arr[mid] == 0)
                lb = mid + 1;
            else if (arr[mid] == 1) {
                if (mid == 0 || arr[mid - 1] == 0)
                    return mid;
                ub = mid - 1;
            }
        }
        return -1;

        //Time: O(logn)
        //Space: O(1)

        //method2 : find the index of '1' by just traversing the array since the array is sorted
    }
}
