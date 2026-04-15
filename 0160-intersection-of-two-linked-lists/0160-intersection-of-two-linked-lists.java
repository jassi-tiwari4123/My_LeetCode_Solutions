/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //O(n*m) BRUTE
        // ListNode temp1=headA;
        // while(temp1!=null){
        //     ListNode temp2=headB;
        //     while(temp2!=null){
        //         if(temp1==temp2){
        //             return temp1;
        //         }
        //         temp2=temp2.next;
        //     }
        //     temp1=temp1.next;
        // }
        // return null;


        // Better O(n+m)
        HashSet<ListNode> s=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            s.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(s.contains(temp)) return temp;
            temp=temp.next;
        }
        return null;
    }
}