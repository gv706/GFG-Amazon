public class _35_RotateALinkedList {
    static LLNode head=null;
    public static LLNode rotate(LLNode head, int k) {
        int co=0;
        LLNode temp=head;
        while (temp.next!=null){
            co++;
            temp=temp.next;
        }
        co++;
        temp.next=head;

        k=k%co;
        for (int i=1;i<=k;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;

        //Time: O(n)
        // Space: O(1)
    }

}
