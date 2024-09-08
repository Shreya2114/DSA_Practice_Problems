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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int size =0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int splitSize = size /k;
        int remParts = size %k;
        temp = head;
        ListNode prev = temp;
        for(int i =0; i<k ; i++){
            ListNode newPart = temp;
            int currentSize = splitSize;
            if(remParts > 0){
                remParts--;
                currentSize++;
            }
            int j =0; 
            while(j < currentSize){
                prev = temp;
                temp = temp.next;
                j++;
            
        }
            if(prev != null){
                prev.next = null;
            }
            ans[i] = newPart;
        }
        return ans;
    }
}