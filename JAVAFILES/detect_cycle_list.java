/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head==null)
        return false;
    else
    {
        int p=0;
        while(head!=null)
        {
            p++;
            head=head.next;
            if(p>100)
                break;
        }
        if(p>100)
            return true;
        else
            return false;
    }

}
