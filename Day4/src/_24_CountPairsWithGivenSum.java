import java.util.HashMap;

public class _24_CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (m.containsKey(k - arr[i])) {
                count += m.get(k - arr[i]);
            }
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
        return count;

        //Time: O(n)
        //Space: O(n)

        //method2: By using nested loops
        //method 3: Using binary search
    }
}
