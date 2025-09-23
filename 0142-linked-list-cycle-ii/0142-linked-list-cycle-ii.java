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
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        // HashSet<ListNode> seen =new HashSet<>();
        while(fast.next!=null && fast.next.next!=null){
            // seen.add(slow);
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode n=head;
                while(n!=slow){
                    n=n.next;
                    slow=slow.next;
                }
                return n;
            }
        }
        return null;
    }
}