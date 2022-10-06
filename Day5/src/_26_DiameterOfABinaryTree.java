class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data=data;
    }
}
public class _26_DiameterOfABinaryTree {
    static int maxi=0;
    int diameter(Node root) {
        if (root==null)
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        return Math.max(1+lh+rh, Math.max(ld,rd));
    }

    static int height(Node n){
        if (n==null)
            return 0;
        return 1+Math.max(height(n.left), height(n.right));
    }

    static int method2(Node root){
        findDiameter(root);
        return maxi;
    }
    static int findDiameter(Node root){
        if (root==null)
            return 0;
        int lh=findDiameter(root.left);
        int rh=findDiameter(root.right);
        maxi=Math.max(maxi, lh+rh+1);
        return 1+Math.max(lh, rh);
    }
}
