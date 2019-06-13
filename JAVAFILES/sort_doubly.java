class Node
{
	int data;
	Node next;
	Node prev;
}

class sort_doubly
{
Node SortedInsert(Node head,int data)
 {
    Node temp=new Node();
    temp.data=data;
    temp.prev=null;
    temp.next=null;
    if(head==null)
        head=temp;
        
    else
    {
        while(head.next!=null)
        {
            head=head.next;
        }
        if(temp.data<=head.data)
        {
			 head.prev=temp;
            temp.next=head;
			temp=head;
        }
        else
        {
        head.next=temp;
        temp.prev=head;
        }
    }
    return head;
  
}


public static void main(String args[])
{
	Node head=null;
	Node ptr=head;
sort_doubly me=new sort_doubly();
head=me.SortedInsert(head,4);
head=me.SortedInsert(head,2);
head=me.SortedInsert(head,6);
head=me.SortedInsert(head,5);
while(head!=null)
{
System.out.println(head.data);
head=head.next;
}
}
}
