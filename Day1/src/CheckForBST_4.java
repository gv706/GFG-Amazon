public class CheckForBST_4 {
    boolean isBST(Node root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isValid(Node root, int min, int max){
        if (root==null)
            return true;
        if (root.data<min || root.data>max)
            return false;
        return isValid(root.left, min, root.data) &&
                isValid(root.right, root.data, max);

        //Time: O(n)
        //Space: O(1) (excluding stack space)
    }
}
