/*
class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        Node next1;
        Node cur;
        Node prev;
        
        cur = head;
        next1 = null;
        prev = null;
        
        while(cur != null)
        {
            next1 = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next1;
          
        }
        
        return prev;
        
    }
}