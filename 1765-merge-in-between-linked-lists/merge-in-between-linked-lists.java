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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode finda=list1;
        ListNode findb=list1;
        for(int i=0;i<a-1;i++){
            finda=finda.next;
        }
       for(int j=0;j<b;j++){
            findb=findb.next;
        }
        ListNode next=findb.next;
        finda.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=next;
        return list1;
    }
}