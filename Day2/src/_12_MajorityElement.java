public class _12_MajorityElement {
    static int majorityElement(int a[], int size) {
        int ele=-1, count=0;

        for (int i = 0; i < size; i++) {
            if (count == 0) {
                ele = a[i];
            }
            if (ele==a[i])
                count++;
            else
                count--;
        }

        int c=0;
        for (int i=0;i<size;i++){
            if (a[i]==ele)
                c++;
        }
        if (c>size/2)
            return ele;
        else
            return -1;
        //Time: O(n)
        //Space: O(1)

        //method 2:
        //using the hashmap and maintaining the counts

        //method 3:
        //by running two loops
        //outer loop is to pick one element 'i' and inner loop is used for counting the occurrences of 'i'
    }
}
