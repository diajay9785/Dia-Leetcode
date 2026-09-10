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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode current1=l1;
            ListNode current2=l2;
            ListNode dummy=new ListNode(0);
            ListNode ans=dummy;
            int carry=0;
            while(current1!=null || current2!=null){
                int sum=carry;
                if(current1!=null){
                    sum+=current1.val;
                    current1=current1.next;
                }
                if(current2!=null){
                    sum+=current2.val;
                    current2=current2.next;
                }
                int digit=sum%10;
                carry=sum/10;
                ans.next=new ListNode(digit);
                ans=ans.next;
            }
            if(carry>0){
                ans.next=new ListNode(carry);
            }
            return dummy.next;
    }
}