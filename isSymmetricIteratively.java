/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * ************ ITERATIVELY **********
 */
public class Solution {
    public boolean isSymmetricIteratively(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return true;
        }
        
        Queue<TreeNode> q1 = new LinkedList<TreeNode>(); //left side
        Queue<TreeNode> q2 = new LinkedList<TreeNode>(); //right side
        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();
            if(n1 == null && n2 == null){
                continue;
            }else if( (n1 != null && n2 == null) || (n1 == null && n2 != null)){
                return false;
            }else if( n1.val != n2.val){
                /* don't forget check the data */
                return false;
            }else{
                q1.add(n1.left);
                q1.add(n1.right);
                /* attention: sequence */
                q2.add(n2.right);
                q2.add(n2.left);
            }
        }
        if(q1.isEmpty() && q2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
