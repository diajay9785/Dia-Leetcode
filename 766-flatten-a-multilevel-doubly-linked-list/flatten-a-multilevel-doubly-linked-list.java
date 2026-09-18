/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node current=head;
        while(current!=null){
            if(current.child!=null){
            Node next=current.next;
            Node child=current.child;
            current.next=child;
            child.prev=current;
            Node temp=child;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=next;
            if(next!=null){
                next.prev=temp;
            }
            current.child=null;
        }
        current=current.next;
    }
    return head;
    }
}