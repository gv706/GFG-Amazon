import java.util.Stack;

public class _25_ParenthesesChecker {
    static boolean ispar(String x) {
        Stack<Character> st=new Stack<>();

        int n=x.length();

        for (int i=0;i<n;i++){
            char ch=x.charAt(i);
            if (ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            else {
                if (st.isEmpty())
                    return false;
                char cTop=st.pop();
                if (!((cTop=='(' && ch==')') ||
                        (cTop=='{' && ch=='}') ||
                        (cTop=='[' && ch==']') ))
                    return false;
            }
        }

        return st.isEmpty();

        //Time: O(|x|)
        //Space: O(|x|)
    }
}
