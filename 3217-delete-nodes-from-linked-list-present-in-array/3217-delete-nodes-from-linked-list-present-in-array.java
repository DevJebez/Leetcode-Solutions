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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i< nums.length;i++){
            s.add(nums[i]);
        }
        while(s.contains(head.val)){
            head = head.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            if(s.contains(temp.val)){
                prev.next = temp.next;
            }else{ 
                prev = temp;
                
            }
            temp = temp.next;

        }
        return head;
    }
}