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
    public ListNode swapPairsImproved(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode aux = new ListNode(0);
        aux.next = head;
        ListNode cur = aux;
        ListNode nxt = cur.next;
        //ListNode pre = null;
        while(nxt != null && nxt.next != null){
            ListNode tmp = nxt.next.next;
            nxt.next.next = nxt;
            cur.next = nxt.next;
            nxt.next = tmp;
            
            cur = nxt;
            nxt = cur.next;
        }
        return aux.next;
    }
}
