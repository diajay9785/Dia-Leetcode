/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map=new HashMap<>();
        ListNode current=head;
        int i=0;

        while(current!=null){
            if(map.containsKey(current)){
                return current;
            }

            map.put(current,i);
            current=current.next;
            i++;
        }

        return null;
    }
}
