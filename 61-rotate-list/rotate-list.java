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
        int size=0;
        ListNode current=head;
        while(current!=null){
            size++;
            current=current.next;
        }
        k=k%size;
        if(k==0){
            return head;
        }
        current=head;
        int n=size-k-1;
        while(n>0){
            current=current.next;
            n--;
        }
        ListNode newHead=current.next;
        current.next=null;
        current=newHead;
        while(current.next!=null){
            current=current.next;
        }
        current.next=head;

        return newHead;
    }
}