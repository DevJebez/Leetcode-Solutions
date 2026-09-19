/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = new ListNode();
        ListNode p3 = result;
        int carry = 0;
        boolean hasCarry = false;
        while(p1 != null && p2 !=null){
            int sum = p1.val + p2.val + carry;
            if(sum >= 10){
                carry = sum / 10;
                hasCarry = true;
            }
            else{
                hasCarry = false;
                carry = 0;
            }
            p3.next = new ListNode(sum % 10);
            p3 = p3.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p1 != null){
            int sum = p1.val + carry;
            if(sum >= 10){
                carry = sum / 10;
                hasCarry = true;
            }else{
                hasCarry = false;
                carry = 0;
            }
            p3.next = new ListNode(sum % 10);
            p3 = p3.next;
            p1 = p1.next;
        }
        while(p2 != null){
            int sum = p2.val + carry;
            if(sum >= 10){
                carry = sum / 10;
                hasCarry = true;
            }else{
                hasCarry = false;
                carry = 0;

            }
            p3.next = new ListNode(sum % 10);
            p3 = p3.next;
            p2 = p2.next;
        }
        if(hasCarry == true){
            p3.next = new ListNode(carry);
        }
        return result = result.next;
    }
}