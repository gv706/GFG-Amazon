public class _32_HeightOfBinaryTree {
    int height(Node node)
    {
        if (node==null)
            return 0;
        int lh=height(node.left);
        int rh=height(node.right);
        return 1+Math.max(lh, rh);

        //Time: O(n)
        //Space: O(n) //recursive stack space if skewed tree
    }
}
