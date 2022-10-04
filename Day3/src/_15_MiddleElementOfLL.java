public class _15_MiddleElementOfLL {
    int getMiddle(Node head)
    {
       Node slow=head, fast=head;

       while (fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return  slow.data;

       //Time: O(n/2)
        //space: O(1)

        //method 2: Maintaining the count variable
    }
}
