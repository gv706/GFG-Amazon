public class _34_RotateAnArray {
    static void rotateArr(int arr[], int d, int n) {

        //Juggling algorithm

        /*d=d%n;
        int gcd=findGCD(n,d);
        for (int i=0;i<gcd;i++){
            int j=i, k, temp=arr[i];
            while (true){
                k=j+d;
                if (k>=n)
                    k-=n;
                if (k==i)
                    break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }*/

        d=d%n;
        int gcd=findGCD(n,d);
        for (int i=0;i<gcd;i++){
            int j=i, k=i, temp=arr[i];
            while (true){
                k=(k+d)%n;
                if (k==i)
                    break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }

        //Time: O(n)
        //Space: O(1)

    }

    static int findGCD(int a, int b){
        if (b==0)
            return a;
        return findGCD(b, a%b);
    }
}
