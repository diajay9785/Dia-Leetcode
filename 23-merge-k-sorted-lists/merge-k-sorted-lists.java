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
    public ListNode mergeKLists(ListNode[] lists) {
       if (lists == null || lists.length == 0) {
            return null; 
        } 
        ListNode result=null;
        for(int i=0;i<lists.length;i++){
            result=mergeTwoLists(result,lists[i]);
        }
        return result;
    }
    public ListNode mergeTwoLists(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                current.next=a;
                a=a.next;
            }
            else{
                current.next=b;
                b=b.next;
            }
            current=current.next;
        }
        if(a!=null){
            current.next=a;
        }
        else if(b!=null){
            current.next=b;
        }
        return dummy.next;
    }
}