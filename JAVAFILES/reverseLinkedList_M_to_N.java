**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        
        ListNode start = A;
        ListNode prestart = null;
        int count = 1;
        
        // reach till startpoint
        while(count < B){
            prestart = start;
            start = start.next;
            count++;
        }
        
        // start reversing
        ListNode current = start;
        ListNode prev = prestart;
        ListNode next = prestart;
        
        while(count<=C){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count ++;
        }
        
        // manage endpoint pointers and head
        start.next = next;
        if(prestart==null){
            A = prev;
        }else{
            prestart.next = prev;
        }
        
        return A;   
    }
}
