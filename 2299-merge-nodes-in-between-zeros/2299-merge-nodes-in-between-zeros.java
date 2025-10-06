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
    public ListNode mergeNodes(ListNode head) {
        return merger(head.next);
    }
    public ListNode merger(ListNode head){
        if(head==null) return null;
        ListNode temp=head;
        int sum=0;
        while(temp.val!=0){
            sum+=temp.val;
            temp=temp.next;
        }
        ListNode t=new ListNode(sum);
        t.next=merger(temp.next);
        return t;

    }
}