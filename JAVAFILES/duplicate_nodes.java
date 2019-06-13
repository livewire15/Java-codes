/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
if(head==null)
{
    return head;
}
    else if(head.next==null)
        return head;
    else
    {
        Node root=head;
    while(head.next!=null)
    {
        Node ptr=head.next;
            if(ptr.data==head.data)
            {
                head.next=ptr.next;
            }
        else
        {
               head=head.next;
        }
      }
        return root;
    }
    
}
   
