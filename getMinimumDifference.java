class Solution {
    Integer prev=null;
    int minDiff=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        if(prev!=null){
            minDiff=Math.min(minDiff,root.val-prev);
        }
        prev=root.val;
        inorder(root.right);
    }
}
