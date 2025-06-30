// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        if(head1 == null || head2==null)
        {
            return -1;
        }
        
        Set<Integer> set1 = new HashSet<>();
        
        
        while(head1 != null)
        {
            set1.add(head1.data);
            head1=head1.next;
        }
        
       
        
        
    int count =0; 
    while(head2!=null)
    {
        int a = x - (head2.data);
        
        if(set1.contains(a))
        {
            count++;
        }
        head2 = head2.next;
    }
        
        return count;
}
}