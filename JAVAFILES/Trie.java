import java.util.*;
class Trie
{
	static final int alphabet_size=26;

	 static class Trienode
	{
		Trienode[] children=new Trienode[alphabet_size];
		boolean isEndWord;
		int countPrefix;

		Trienode()
		{
			isEndWord=false;
			countPrefix=0;
			for(int i=0;i<children.length;i++)
			{
			children[i]=null;
			}
		}
	};

	static Trienode root;

	static void insert(String key)
	{
		Trienode temp=root;
		for(int i=0;i<key.length();i++)
		{
			int idx=key.charAt(i)-'a';
			if(temp.children[idx]==null)	//if null then create a new node.
				temp.children[idx]=new Trienode();
			temp.countPrefix++;
			temp=temp.children[idx];	//Increment the pointer like in linkedlist head=head.next.
		}
		temp.isEndWord=true;
	}

	static int prefixCount(String prefix)
	{
		Trienode temp=root;
		for(int i=0;i<prefix.length();i++)
		{
			int idx=prefix.charAt(i)-'a';
			if(temp.children[idx]==null)
				return 0;
			temp=temp.children[idx];
		}
		return temp.countPrefix;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		root=new Trienode();
		while(q-->0)
		{
			int a=sc.nextInt();
			String s=sc.next();
			if(a==0)
			{
				insert(s);
			}
			else
			{
				System.out.println(prefixCount(s));
			}
		}
	}
}