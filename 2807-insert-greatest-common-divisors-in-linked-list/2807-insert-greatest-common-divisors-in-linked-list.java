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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp1=head;
        ListNode temp2=head.next;
        while(temp2!=null){
            int a=temp1.val;
            int b=temp2.val;
            int hcf=gcd(a,b);
            ListNode h=new ListNode(hcf);
            h.next=temp1.next;
            temp1.next=h;
            temp1=temp2;
            temp2=temp2.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}