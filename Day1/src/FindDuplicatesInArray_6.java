import java.util.ArrayList;

public class FindDuplicatesInArray_6 {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
       /* ArrayList<Integer> res=new ArrayList<>();
        for (int i=0;i<n;i++){
            arr[i]++;
        }
        for (int i=0;i<n;i++){
            int val=Math.abs(arr[i]);
            if (arr[val]<0){
                if (!res.contains(val))
                    res.add(val-1);
            }
            else {

                arr[val]=-arr[val];
            }
        }
        if (res.isEmpty())
            res.add(-1);
        Collections.sort(res);
        return res;*/

        ArrayList<Integer> res=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length]
                    = arr[arr[i] % arr.length]
                    + arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
                res.add(i);
            }
        }
        if (res.isEmpty())
            res.add(-1);
        return res;
        //Time:O(n)
        //Space:O(1)
    }
}
