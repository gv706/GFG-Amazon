public class _33_BalancedBinaryTree {
    boolean isBalanced(Node root) {
        return check(root) != -1;
    }

    static int check(Node n){
        if (n==null)
            return 0;

        int lh=check(n.left);
        int rh=check(n.right);
        if (lh==-1 || rh==-1)
            return -1;
        if (Math.abs(lh-rh)>1)
            return -1;
        return 1+Math.max(lh, rh);
    }

    //method2 (Naive)
    static boolean naiveCheck(Node root){
        if (root==null)
            return true;
        int lh=height(root.left);
        int rh=height(root.right);
        if (Math.abs(lh-rh)>1)
            return false;

        boolean left= naiveCheck(root.left);
        boolean right= naiveCheck(root.right);
        return left && right;

        //Time: O(n^2)
    }

    static int height(Node node)
    {
        if (node==null)
            return 0;
        int lh=height(node.left);
        int rh=height(node.right);
        return 1+Math.max(lh, rh);
    }
}
