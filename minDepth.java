/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * ******** TRICKY ONE ************
 */
public class Solution {
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if( root == null ){
            return 0;
        }
        if( root.left == null && root.right == null){
            return 1;
        }else if( root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        }else if( root.left != null && root.right == null){
            return minDepth(root.left) + 1;
        }else {
            return Math.min( minDepth(root.left), minDepth(root.right) ) + 1;
        }
    }
}
