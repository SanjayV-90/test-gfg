// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        int i=0;
         while(i<=n && head!= null)
         {
             if(head.data == key)
             {
                return true;
             }
             
              head=head.next;
            ++i;
         }
         return false;
    }
}