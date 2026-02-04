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

    public ListNode reverse(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        // Base case
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHead = reverse(slow);

        // Step 3: Compare
        ListNode first = head;
        ListNode second = secondHead;

        while (second != null) {

            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}
