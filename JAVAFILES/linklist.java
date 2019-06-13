import java.util.*;

 class Node
{
int data;
Node next;
}

class linklist
{
public static void main(String args[])
{
list ll=new list();
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice");
int choice=sc.nextInt();
while(choice>0)
{
switch(choice)
{
case 1:
ll.insert_at_beg();
break;
case 2:
ll.insert_at_last();
break;
case 3:
ll.insert_at_pos();
break;
case 4:
ll.delete_at_beg();
break;
case 5:
ll.delete_at_last();
break;
case 6:
ll.delete_at_pos();
break;
case 7:
ll.print();
break;
default:
System.out.println("Wrong entry");
System.exit(0);
}
System.out.println("Enter your Choice");
choice=sc.nextInt();
}
}
}

class list
{
	Node head=null;

Node insert_at_beg()
{
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();
Node ptr=new Node();
ptr.data=value;
if(head==null)
{
ptr.next=null;
head=ptr;
}
else
{
ptr.next=head;
head=ptr;
}
return head;
}

 Node insert_at_last()
{
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();
Node ptr=new Node();
ptr.data=value;
ptr.next=null;
if (head==null)
{
head=ptr;
}
else
{
Node ptr1=head;
while(ptr1.next!=null)
{
ptr1=ptr1.next;
}
ptr1.next=ptr;
}
return head;
}

 Node insert_at_pos()
{
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();
Node ptr=new Node();
int p=1;
ptr.data=value;
System.out.println("enter the position");
int pos=sc.nextInt();

Node ptr1=head;
while(p<pos)
{
ptr1=ptr1.next;
p++;
}
ptr.next=ptr1.next;
ptr1.next=ptr;
return head;
}

Node delete_at_beg()
{
if(head==null)
System.out.println("Deletion not possible");
else
head=head.next;
return head;
}

 Node delete_at_last()
{
if(head==null)
System.out.println("Deletion not possible");
else
{
Node ptr1=head;
Node preptr=ptr1;
while(ptr1.next!=null)
{
preptr=ptr1;
ptr1=ptr1.next;
}
preptr.next=null;
}
return head;
}

Node delete_at_pos()
{
	Scanner sc=new Scanner(System.in);
if(head==null)
System.out.println("Deletion not possible");
else
{
int pos=sc.nextInt();
int p=0;
Node ptr=head;
Node preptr=ptr;
while(p<pos)
{
preptr=ptr;
ptr=ptr.next;
p++;
}
preptr.next=ptr.next;
}
return head;
}

 Node print()
{
while(head!=null)
{
System.out.println(head.data);
head=head.next;
}
return head;
}
}




