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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode previous=dummy;
        for(int i=1;i<left;i++){
            previous=previous.next;
        }
        ListNode current=previous.next;
        ListNode tail=current;
        for(int i=left;i<=right;i++){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        tail.next=current;
        if(left==1){
            return previous;
        }
        ListNode temp=dummy;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=previous;
        return dummy.next;
    }
}