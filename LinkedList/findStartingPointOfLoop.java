/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null)
            return null;
        ListNode slow, fast,prev = null;
        slow = fast = head;
        boolean found = false;
        while(fast.next!=null && fast.next.next!=null){
            prev = slow;
            slow = slow.next ;
            fast = fast.next.next;
            if(slow == fast){
                found = true;
                break;
            }
            
        }
        if(!found){
            return null;
        }else{
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
        
    }
}
