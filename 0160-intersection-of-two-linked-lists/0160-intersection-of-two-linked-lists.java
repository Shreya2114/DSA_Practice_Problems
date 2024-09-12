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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA =0, lenB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null){
            tempA = tempA.next;
             lenA++;
        }
        while(tempB != null){
            tempB = tempB.next;
            lenB++;
        }
        tempA = headA;
        tempB = headB;
        // int d = Math.abs(lenA - lenB);
        if(lenA > lenB){
            for(int i =1; i<=lenA - lenB; i++){
                tempA = tempA.next;
            }
        }
        else{
            for(int i =1; i<=lenB - lenA; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
        
    }
}