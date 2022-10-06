public class _28_IntersectionPointInYShapedLL {
    int intersectPoint(LLNode head1, LLNode head2)
    {
        LLNode dum1=head1, dum2=head2;
        while(dum1!=null && dum2!=null){
            dum1=dum1.next;
            dum2=dum2.next;
        }
        if(dum1==null) {
            dum1 = head2;
            while (dum2!=null) {
                dum1=dum1.next;
                dum2 = dum2.next;
            }
            dum2=head1;
        }
        else {
            dum2 = head1;
            while (dum1!=null) {
                dum1 = dum1.next;
                dum2 = dum2.next;
            }
            dum1=head2;
        }
        while (dum1!=null && dum2!=null && dum1!=dum2){
            dum1=dum1.next;
            dum2=dum2.next;
        }
        if (dum1==null || dum2==null)
            return -1;
        else
            return dum1.data;

        //Time: O(n)
        //Space: O(1)
    }
}
