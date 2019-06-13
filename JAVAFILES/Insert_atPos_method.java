/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node ptr=new Node();
    Node p1=new Node();
    ptr.data=data;
    int k=0;
    if(position==0)
        {
        ptr.next=head;
        head=ptr;      
    }
    else
        {
        Node p=head;       
        while(k<position)
            {
            p1=p;
           p=p.next;
            k++;
        }
        ptr.next=p;
        p1.next=ptr;
    }
    return head;
}
