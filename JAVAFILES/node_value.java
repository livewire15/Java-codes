/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method.
    Node root=head;
    int p=0,count=1;
    while(root!=null)
    {
        p++;
        root=root.next;
    }
    while(count<(p-n))
    {
        count++;
        head=head.next;
    }

return head.data;


}
