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
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return false;
        }
        
        int tmpsum = sum - root.val;
        /* encountered some difficulty when define if else */
        if( tmpsum == 0 && root.left == null && root.right == null){
            return true;
        }else{
            return hasPathSum(root.left, tmpsum) || hasPathSum(root.right, tmpsum);
        }
    }
}
