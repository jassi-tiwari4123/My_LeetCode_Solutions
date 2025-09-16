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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kth=getKthNode(temp,k);
            if(kth==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
            }
            ListNode next=kth.next;
            kth.next=null;
            ListNode newHead=reverse(temp);
            if(temp==head){
                head=kth;
            }
            else{
                prev.next=kth;
            }
            prev=temp;
            temp=next;
        }
        return head;
    }
    public ListNode getKthNode(ListNode temp,int k){
        while(temp!=null && k>1){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}