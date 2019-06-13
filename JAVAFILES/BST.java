import java.util.*;

class Node
{
Node left,right;
int data;

public Node()
{
left=null;
right=null;
}
}

class BST
{
public static void main(String args[])
{
	BST ob=new BST();
	Node root=null;
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
while(choice>0)
{
switch(choice)
{

case 1:  //Insertion

System.out.println("Enter a node to insert");
int d=sc.nextInt();
Node ptr=new Node();          /*New Node*/
ptr.data=d;
ptr.left=ptr.right=null;

if(root==null)
{
System.out.println("hey");
root=ptr;
}
 
                               // To insert a node our first task is to find the place to insert the node.
                               // Take current = root .
                               // start from the current and compare root.data with n
                               // if current.data is greater than n that means we need to go to the left of the root.
                               // if current.data is smaller than n that means we need to go to the right of the root.
                               // if any point of time cur­rent is null that means we have reached to the leaf node, 
else						   // insert your node here with the help of par­ent node.
{
Node current=root;
Node parent=null;

while(true)           
{
parent=current;
if(ptr.data<current.data)
{ 
current=current.left;
if(current==null)
{
	parent.left=ptr;
	break;
}
}
else
{
	current=current.right;
	if(current==null)
	{
	parent.right=ptr;
	break;
	}
}
}
}
break;

case 2:

if(root==null)
{
System.out.println("Deletion not possible");
}

else
{
System.out.println("enter the value to be deleted");
int value=sc.nextInt();
Node parent = root;
Node current = root;
boolean isLeftChild = false;
while(current.data!=value)
{
parent = current;
if(current.data>value)
{
isLeftChild = true;
current = current.left;
}
else
{
isLeftChild = false;
current = current.right;
}
if(current ==null)
{
break;
}
}


//Case 1: if node to be deleted has no children
if(current.left==null && current.right==null)
{
if(current==root)
{
root = null;
}
if(isLeftChild ==true)
{
parent.left = null;
}
else
{
parent.right = null;
}
}

//Case 2 : if node to be deleted has only one child
else if(current.right==null)
{
if(current==root)
{
root = current.left;
}
else if(isLeftChild)
{
parent.left = current.left;
}
else
{
parent.right = current.left;
}
}

else if(current.left==null)
{
if(current==root)
{
root = current.right;
}
else if(isLeftChild)
{
parent.left = current.right;
}else
{
parent.right = current.right;
}
}

else if(current.left!=null && current.right!=null){
			
//now we have found the minimum element in the right sub tree
Node successor	 = getSuccessor(current);
if(current==root)
{
root = successor;
}
else if(isLeftChild)
{
parent.left = successor;
}
else
{
parent.right = successor;
}			
successor.left = current.left;
}				
	
	public Node getSuccessor(Node deleleNode)
	{
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null)
		{
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNode.right)
		{
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
}
break;

case 3:
System.out.println("Preorder traversal");
ob.preorder(root);
break;

case 4:
System.out.println("Inorder traversal");
ob.inorder(root);
break;

case 5:
System.out.println("Postorder traversal");
ob.postorder(root);
break;

default:
System.exit(0);
break;
}
System.out.println("Enter your Choice");
choice=sc.nextInt();
}
}

Node preorder(Node root)
{
	if(root!=null)
{
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
}
return root;
}

Node inorder(Node root)
{
if(root!=null)
{
inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);
}
return root;
}

Node postorder(Node root)
{
	if(root!=null)
{
postorder(root.left);
postorder(root.right);
System.out.print(root.data+" ");
}
return root;
}
}


