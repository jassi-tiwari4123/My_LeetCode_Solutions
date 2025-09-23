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
        while(fast.next!=null && fast.next.next!=null){
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

        // Not an optimised way taking o(n) space
        // HashSet<ListNode> seen=new HashSet<>();
        // if(head==null || head.next==null){
        //     return null;
        // }
        // ListNode x=head;
        // while(x!=null){
        //     if(seen.contains(x)){
        //         return x;
        //     }
        //     seen.add(x);
        //     x=x.next;
        // }
        // return null;
    }
}