/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        
        
        Node cur = head;
        Node prev = null;
        int count = 0;
        while(count<k && cur !=null )
        {
            Node nextnode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextnode;
            count++;
        }
        
        if(cur!=null)
        {
            head.next=reverseKGroup(cur,k);
        }
        
        return prev;
        
    }
}