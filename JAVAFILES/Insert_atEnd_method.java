/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node ptr=new Node();
    ptr.data=data;
    ptr.next=null;
    if(head==null)
        {
        head=ptr;
    }
    else
     {
        Node p=head;
    while(p.next!=null)
        {
        p=p.next;
    }
    p.next=ptr;
        
    } 
    return head;
}
