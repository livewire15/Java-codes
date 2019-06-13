import java.util.*;
class Node
{
	int data;
	Node left,right;
}

class levelOrder
{
	static Node root=null; 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			int val=sc.nextInt();
			root=insert(root,val);
		}
		levelOrder(root);
	}

	static Node insert(Node root,int val)
	{
		if(root==null)
		{
		Node ptr=new Node();
		ptr.data=val;
		root=ptr;
		}
		else if(val<root.data)
		{
			root.left=insert(root.left,val);
		}
		else
		{
			root.right=insert(root.right,val);
		}
		return root;
	}

	static void levelOrder(Node root)
	{
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node val=queue.poll();
			System.out.print(val.data+" ");
			if(val.left!=null)
				queue.add(val.left);
			if(val.right!=null)
				queue.add(val.right);
		}
	}
}