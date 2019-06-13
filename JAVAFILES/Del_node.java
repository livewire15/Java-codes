/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    int k=0;
    if(position==0)
        {
        head=head.next;
    }
    else
        {
        Node p=head;
        while(k<position-1)
            {
            p=p.next;
            k++;
        }
        Node p1=p;
        p=p.next;
        p1.next=p.next;
    }
    return head;

}

