/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        /*
        ListNode nxt = node.next;
        while(nxt.next !=null){
            node.val = nxt.val;
            node = node.next;
            nxt = nxt.next;
        }
        node.val = nxt.val;
        node.next = null;
        */
        node.val = node.next.val;      // Copy next node's value
        node.next = node.next.next;   
    }
}