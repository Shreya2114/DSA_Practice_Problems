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
    public int lengthLL(ListNode head){
        int len =0;
        ListNode temp = head;
        while(temp != null){
           
            temp = temp.next;
             len++;
        }
        return len;
    }
    public ListNode oddEvenList(ListNode head) {
       if(head == null) return null;
        int len = lengthLL(head);
        ListNode temp = head;
        ListNode a = new ListNode(-1);
        ListNode tempO =  a ;
        ListNode b = new ListNode(-1);
        ListNode tempE = b;
        for(int i =1; i<=len; i++){
            if(i%2 == 0){
                tempE.next = temp;
                 tempE = tempE.next;
            }
            else{
                tempO.next = temp;
                tempO = tempO.next;
                

                
            }
            temp = temp.next;
        }
        tempO.next = b.next;
        tempE.next = null;
        return a.next;
        
        
    }
}