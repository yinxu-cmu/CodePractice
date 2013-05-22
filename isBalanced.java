/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return true;
        }
        /* 3 conditions: self balanced, left and right blanced */
        return isBalAux(root) && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int maxDepth(TreeNode n){
        int maxDepth;
        if( n!= null){
            maxDepth = Math.max(maxDepth(n.left), maxDepth(n.right)) + 1;
        }else{
            maxDepth = 0;
        }
        return maxDepth;
    }
    /* Auxiliary function, check whether each node itself is balanced*/
    public boolean isBalAux(TreeNode n){
        if( n == null){
            return true;
        }
        if( Math.abs(maxDepth(n.left) - maxDepth(n.right)) > 1){
            return false;
        }else{
            return true;
        }
    }
}


