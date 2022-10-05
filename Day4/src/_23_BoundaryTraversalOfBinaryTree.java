import java.util.ArrayList;
import java.util.Stack;

public class _23_BoundaryTraversalOfBinaryTree {
    static boolean isLeaf(Node n){
        return n.left==null && n.right==null;
    }
    static void addLeftNodes(Node n, ArrayList<Integer> res){
        Node cur=n.left;
        while (cur!=null){
            if (!isLeaf(cur)) res.add(cur.data);
            if (cur.left!=null) cur=cur.left;
            else cur=cur.right;
        }
    }
    static void addRightNodes(Node n, ArrayList<Integer> res){
        Node cur=n.right;
        Stack<Integer> st=new Stack<>();
        while (cur!=null){
            if (!isLeaf(cur)) st.add(cur.data);
            if (cur.right!=null) cur=cur.right;
            else cur=cur.left;
        }

        while (!st.isEmpty()){
            res.add(st.pop());
        }
    }
    static void addLeaves(Node n, ArrayList<Integer> res){
        if (isLeaf(n)){
            res.add(n.data);
            return;
        }
        if (n.left!=null) addLeaves(n.left, res);
        if (n.right!=null) addLeaves(n.right, res);
    }
    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> res=new ArrayList<>();
        res.add(node.data);
        if (isLeaf(node))
            return res;

        addLeftNodes(node, res);
        addLeaves(node, res);
        addRightNodes(node, res);
        return res;

        //Time: O(n)
        //Space: O(Height of binary tree)
    }
}
