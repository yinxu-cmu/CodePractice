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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null){
            return null;
        }
        
        if(head.next == null){
            return head;
        }
        
        ListNode cur = head;
        head = head.next;
        ListNode next = cur.next;
        ListNode pre = null;
        while(cur != null && next != null){
            cur.next = next.next;
            next.next = cur;
            if(pre != null){
                pre.next = next;
            }
            pre = cur;
            cur = cur.next;
            if(cur != null){
                next = cur.next;
            }else{
                next = null;
            }
        }
        return head;
    }
}
