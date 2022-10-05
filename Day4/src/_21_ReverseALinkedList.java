public class _21_ReverseALinkedList {
    LLNode reverseList(LLNode head)
    {
        LLNode curr=head, next, prev=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        //Time: O(n)
        //Space: O(1)
    }
}
