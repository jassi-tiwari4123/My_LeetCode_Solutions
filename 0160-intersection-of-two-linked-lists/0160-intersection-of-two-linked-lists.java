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
        // HashSet<ListNode> s=new HashSet<>();
        // ListNode temp=headA;
        // while(temp!=null){
        //     s.add(temp);
        //     temp=temp.next;
        // }
        // temp=headB;
        // while(temp!=null){
        //     if(s.contains(temp)) return temp;
        //     temp=temp.next;
        // }
        // return null;

        // Best O(n+m) and space O(1)
        if(headA==null || headB==null) return null;
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=t2){
            t1=(t1==null)? headB:t1.next;
            t2=(t2==null)? headA:t2.next;
        }
        return t1;
    }
}