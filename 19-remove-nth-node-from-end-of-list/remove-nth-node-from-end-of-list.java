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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode current=head;
        while(current!=null){
            size++;
            current=current.next;
        }
        n=size-n+1;
        if(n==1){
            return head.next;
        }
        current=head;
        ListNode previous=null;
        int i=1;
        while(current!=null){
            if(i==n){
                previous.next=current.next;
            }
            previous=current;
            current=current.next;
            i++;
        }
        return head;
    }
}