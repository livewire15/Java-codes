/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if (head == null) {
        return null;
    }
    
    if (head.next == null) {
        return head;
    }
            
    Node preNode = null;
    Node currNode = head;
    Node nextNode = null;
     
    while (currNode != null) {
        nextNode = currNode.next;
        currNode.next = preNode;
        preNode = currNode;
        currNode = nextNode;
    }
    
    head = preNode;
    
    return head;
}


