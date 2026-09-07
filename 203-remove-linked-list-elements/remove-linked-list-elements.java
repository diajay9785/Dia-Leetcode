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
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous=null;
        ListNode current=head;
        while(current!=null){
            if(current.val==val && current==head){
                head=current.next;
                current=current.next;
            }
            else if(current.val==val){
                previous.next=current.next;
                current = current.next;
            }
            else if(current.val!=val){
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
}