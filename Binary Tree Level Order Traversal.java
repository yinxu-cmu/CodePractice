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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> level = new ArrayList<Integer>();
        TreeNode pre = root;
        while(!q.isEmpty() ){
            TreeNode cur = q.poll();
            if(cur != null ){
                level.add(cur.val);
                if( cur.left != null){
                    q.add(cur.left);
                }
                if( cur.right != null){
                    q.add(cur.right);
                }
            }else{
                /* level end reached */
                if(pre != null){
                    result.add(level);
                    level = new ArrayList<Integer>();
                    q.add(null);    
                }else{
                    break;
                }
                
            }
            /* use pRE to avoid endless loop, which adds null forever.... */
            pre = cur;
            
        }
        return result;
    }
}
