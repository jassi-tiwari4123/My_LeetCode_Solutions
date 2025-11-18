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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        ListNode x=temp;
        ListNode y=head;
        while(x.next!=null){
            x=x.next;
            y=y.next;
        }
        int swap=temp.val;
        temp.val=y.val;
        y.val=swap;
        return head;
    }
}