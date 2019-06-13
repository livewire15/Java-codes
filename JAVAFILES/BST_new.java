class Node
{
	int data;
	Node left,right;
}

class BST_new
{
	static Node root=null;
	public static void main(String args[])
	{
		int key[]={1,2,3,4,5,6,7,8};
		for(int i=0;i<key.length;i++)
		{
			root=insertKey(root,key[i]);
		}
		root=deleteNode(root,5);
		inorder(root);
	}

	static void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}

	static Node insertKey(Node root,int key)
	{
		if(root==null)
		{
		Node ptr=new Node();
		ptr.data=key;
		root=ptr;
		}
		else if(key<root.data)
		{
			root.left=insertKey(root.left,key);
		}
		else
		{
			root.right=insertKey(root.right,key);
		}
		return root;
	}

	static Node deleteNode(Node root,int key)
	{
		Node parent=null;
		Node current=root;
		while(current!=null && current.data!=key)
		{
			parent=current;
			if(key<current.data)
				current=current.left;
			else
				current=current.right;
		}

		//return if key is not found in the tree.
		if(current==null)
			return root;

		//Case 1: If node has no children

		if(current.left==null && current.right==null)
		{
			if(current==root)
			{
				root=null;
			}
			else
			{
				if(parent.right==current)
					parent.right=null;
				else
					parent.left=null;
			}
		}

		//Case 2: If node has 2 children.

		else if(current.left!=null && current.right!=null)
		{
			Node successor=minimumKey(current.right);
			int val=successor.data;
			//right subtree mein jo minimum element hai wo mil gaya..ab delete toh successor wala node hi hoga but uski value
			//current value se replace ho jayegi.
			deleteNode(root,val);
			current.data=val;
		}

		//Case 3: If node has one child.

		else
		{
			Node child=(current.left!=null)?current.left:current.right;
			//Now if node to be deleted is not a root node then:
			if(current!=root)
			{
				if(parent.left==current)
					parent.left=child;
				else
					parent.right=child;
			}
			else
			{
				root=child;
			}
		}
		return root;
	}

	static Node minimumKey(Node curr)
	{
		while(curr.left!=null)
			curr=curr.left;
		return curr;
	}
}