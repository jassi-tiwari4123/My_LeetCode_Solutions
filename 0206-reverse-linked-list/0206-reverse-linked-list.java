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
    public ListNode reverseList(ListNode head) {
        // if(head==null || head.next==null){
        //     return head;
        // }
        // ListNode temp=head;
        // ListNode prev=null;
        // while(temp!=null){
        //     ListNode front=temp.next;
        //     temp.next=prev;
        //     prev=temp;
        //     temp=front;
        // }
        // return prev;

        ListNode prev=null;
        return fun(head,prev);
        
    }
    public ListNode fun(ListNode head,ListNode prev){
        if(head==null){
            return prev;
        }
      
        ListNode next=head.next;
        head.next=prev;
        
        return fun(next,head);
    }
}