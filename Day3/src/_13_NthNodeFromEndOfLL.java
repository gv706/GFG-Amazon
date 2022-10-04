public class _13_NthNodeFromEndOfLL {
    int getNthFromLast(Node head, int n)
    {
        Node dum=new Node(-1);
        dum.next=head;
        Node fast=dum, slow=dum;

        for (int i=1;i<=n;i++){
            if (fast!=null)
                fast=fast.next;
            else
                return -1;
        }

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow.data;
        //Time: O(n)
        //Space: O(1)

        //method 2: maintaining count variable and traversing two times. one time for getting the count.
        // other time for getting the node
    }
}
