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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return buildBST(head);
    }
    public TreeNode buildBST(ListNode head){
        if(head==null) return null;
        if(head.next==null){
            return new TreeNode(head.val);
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;//ye list ko hisse mein todne ke liye hai jab mid find kar liya toh prev still connected rahega middle se prev.next=slow vahi connection todne ke liye
        while( fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode mid=slow;
        TreeNode root=new TreeNode(mid.val);
        root.left=buildBST(head);
        root.right=buildBST(slow.next);
        return root;
    }
}