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
    int lengthLL(ListNode head){
        int len = 0;
        if(head == null) return 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            } 
        }
        // {
                // head.val = head.next.val;
                // head.next = head.next.next;
            // }
         return head.val == val ? head.next: head;
    }
}