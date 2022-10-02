public class _10_DetectLoopInLL {
    public static boolean detectLoop(Node head){
        //By using Floyd's cycle finding algorithm

        Node slow=head, fast=head;
        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}
