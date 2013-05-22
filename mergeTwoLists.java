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
 * ********** NEW TRICK TO INIT LINKED LIST! *********
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null && l2 != null){
            return l2;
        }
        
        if(l1 != null && l2 == null){
            return l1;
        }
        
        ListNode l3 = new ListNode(0);
        ListNode newNode = null;
        ListNode pre = l3;
        ListNode c1 = l1;
        ListNode c2 = l2;
        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                newNode = new ListNode(c1.val);
                c1 = c1.next;
            }else{
                newNode = new ListNode(c2.val);
                c2 = c2.next;
            }
            
            pre.next = newNode;
            pre = pre.next;
            
        }
        while(c1 != null){
            pre.next = c1;
            c1 = c1.next;
            pre = pre.next;
        }
        while(c2 != null){
            pre.next = c2;
            c2 = c2.next;
            pre = pre.next;
        }
        return l3.next;
    }
}
