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
    public int getDecimalValue(ListNode head) {
//         ListNode temp = head;
//         int i =0;
//         String str = "";
//         while(temp !=null){
//             str = str + temp.val;
            
//             temp = temp.next;
//         }
//         int deci =0;
//         int j =0;
//         for(int k = str.length()-1; k>=0; k--){
//             deci += (int)(str.charAt(k)-'0') * Math.pow(2,j);
//             j++;
//         }
//         return deci;
        
        int deci =0;
        while(head != null){
            deci = deci *2 + head.val;
            head = head.next;
        }
        return deci;
    }
}