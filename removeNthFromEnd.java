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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if( head == null){
            return null;
        }
        
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        /* check n boundary*/
        if( n > size ){
            return null;
        }
        
        if( n == size ){
            head = head.next;
            return head;
        }
        
        ListNode pre = head;
        for(int i=0; i < size - n - 1; i++){
            pre = pre.next;
        }
        /* pre: previous node to the one deleting */
        pre.next = pre.next.next;
        return head;
    }
}
