import java.util.Stack;

public class _27_MinimumElementFromStack {
    int minEle=-1;
    Stack<Integer> s=new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        if (s.isEmpty())
            return -1;
        else
            return minEle;
    }

    /*returns poped element from stack*/
    int pop()
    {
        if (s.isEmpty())
            return -1;
        int curr=s.peek();
        if (curr < minEle) {
            minEle=2*minEle-curr;
            return (s.pop()+minEle)/2;
        }
        return s.pop();
    }

    /*push element x into the stack*/
    void push(int curr)
    {
        if (s.isEmpty()) {
            s.push(curr);
            minEle=curr;
        }
        else if(curr>=minEle){
            s.push(curr);
        }
        else {
            s.push(2*curr-minEle);
            minEle=curr;
        }
    }
}
