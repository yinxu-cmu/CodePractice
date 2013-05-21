/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* empty list */
        if(head == null){
            return null;
        }
        
        ListNode cur = head;
        while(cur != null){
            
            ListNode curNode = cur;
            ListNode nextNode = cur.next;
            while(nextNode != null){
                int curInt = curNode.val;
                int nextInt = nextNode.val;
                if(curInt == nextInt){
                    /* delete nextNode */
                    curNode.next = nextNode.next;
                }
                
                nextNode = nextNode.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
