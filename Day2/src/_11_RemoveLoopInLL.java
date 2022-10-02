public class _11_RemoveLoopInLL {
    public static void removeLoop(Node head){
        Node slow=head, fast=head;
        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow.next==head) {
                slow.next = null;
                return;
            }
            if (slow==fast){
                remove(head, fast);
                return;
            }
        }
    }
    static void remove(Node head, Node fast){
        Node slow=head;
        while (slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
}
