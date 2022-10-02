import java.util.ArrayList;

public class _7_LeftViewOfBinaryTree {
    ArrayList<Integer> leftView(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        left(root, res, 0);
        return res;
        //Time: O(n)
        //Space: O(Height of binary tree)

        //method 2:
        //By using level order traversal implemented using queue
        //Time:O(n) and Space: O(n)
    }

    static void left(TreeNode treeNode, ArrayList<Integer> res, int level){
        if (treeNode ==null)
            return;
        if (level==res.size())
            res.add(treeNode.data);
        left(treeNode.left, res, level+1);
        left(treeNode.right, res, level+1);
    }

}
