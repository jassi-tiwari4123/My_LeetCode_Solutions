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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        if(k==0) return head;
        int div=n-k;
        temp=head;
        for(int i=1;i<=n-k-1;i++){
            temp=temp.next;
        }
        ListNode newHead=temp.next;
        ListNode x=newHead;
        temp.next=null;
        while(x.next!=null){
            x=x.next;
        }
        x.next=head;
        return newHead;
    }
}