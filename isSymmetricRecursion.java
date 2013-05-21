/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * RECURSION **********************
 */
public class Solution {
    public boolean isSymmetricRecursion(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return true;
        }
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        return isSymAux(left, right);
    }
    
    public boolean isSymAux(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left != null && right != null){
            if(left.val != right.val){
                return false;
            }else{
                boolean l = isSymAux(left.left, right.right);
                boolean r = isSymAux(left.right, right.left);
                return l && r;
            }
        }else{
            return false;
        }
        
    }
}
