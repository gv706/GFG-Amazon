public class _22_CheckPalindromicLL {
    boolean isPalindrome(LLNode head) {
        if (head.next==null)
            return true;

        LLNode slow=head, fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=reverse(slow.next);
        LLNode d=head;
        slow=slow.next;
        while (slow!=null){
            if (d.data!=slow.data)
                return false;
            d=d.next;
            slow=slow.next;
        }
        return true;

        //Time: O(n)
        //Space: O(1)
    }

    static LLNode reverse(LLNode head){
        LLNode prev=null, next;
        while (head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }

        return prev;
    }
}
