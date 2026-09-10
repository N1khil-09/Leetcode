/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public  int sum(TreeNode root){
        if(root == null) return 0;

        
        
        return root.val + sum(root.left) + sum(root.right);
        
    }
    
    public  int count(TreeNode root ){
        if(root == null) return 0;
        return 1 + count(root.left) + count(root.right);

    }
       public int averageOfSubtree(TreeNode root) {
        if (root == null) return 0;

        int average = sum(root) / count(root);

        int ans = 0;

        if (average == root.val)
            ans = 1;

        ans += averageOfSubtree(root.left);
        ans += averageOfSubtree(root.right);

        return ans;
    }
}