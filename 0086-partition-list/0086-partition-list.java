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
    public ListNode partition(ListNode head, int x) {
        ListNode dum1=new ListNode();
        ListNode dum2=new ListNode();

        ListNode prev1=dum1;
        ListNode prev2=dum2;

        while(head!=null){
            if(head.val<x){
                prev1.next=head;
                prev1=prev1.next;
            }
            else{
                prev2.next=head;
                prev2=prev2.next;
            }
            head=head.next;
        }
        prev2.next=null;
        prev1.next=dum2.next;
        return dum1.next;
    }
}