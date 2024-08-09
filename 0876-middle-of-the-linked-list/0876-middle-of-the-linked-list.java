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
        int len =0;
        if(head == null) return 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
    public ListNode middleNode(ListNode head) {
        int len = lengthLL(head);
        int mid = len/2;
        ListNode temp = head;
        for(int i = 0; i<mid; i++){
            temp =temp.next;
        }
        return temp;  
    }
}