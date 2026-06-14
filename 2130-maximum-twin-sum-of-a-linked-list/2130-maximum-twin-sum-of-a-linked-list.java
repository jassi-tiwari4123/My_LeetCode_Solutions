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
    public int pairSum(ListNode head) {
        //two approaches by stack -o(n)
        //by reversing the second half linkedlist
        
        //1. by stack
        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // Stack<Integer> st=new Stack<>();
        // while(slow!=null){
        //     st.push(slow.val);
        //     slow=slow.next;
        // }
        // int res=0;
        // ListNode temp=head;
        // while(!st.isEmpty()){
        //     res=Math.max(res,temp.val+st.pop());
        //     temp=temp.next;
        // }
        // return res;


        //2. by reversing the sec half list
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        int res=0;
        ListNode p1=head;
        ListNode p2=prev;
        while(p2!=null){
            res=Math.max(res,p1.val+p2.val);
            p1=p1.next;
            p2=p2.next;
        }
        return res;

    }
}