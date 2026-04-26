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

 //i will be using min heap by pushing starting element of each list into min heap -> structure: [1,1,2] then popping the smallest then pushing its next into the min heap then structure will be: [1,2,4] and so on
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(!pq.isEmpty()){
            ListNode cur=pq.poll();
            temp.next=cur;
            temp=temp.next;
            if(cur.next!=null){
                pq.add(cur.next);
            }
        }
        return dummy.next;

    }
}