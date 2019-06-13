import java.util.*;
class Trie_contacts
{
    static final int alphabet_size=26;
    static Trienode root;

     static class Trienode
    {
        Trienode[] children;
        boolean isEndWord;
        int countPrefix;

        Trienode()
        {
            children=new Trienode[alphabet_size];
            isEndWord=false;
            countPrefix=0;
        }
    }

    static void insert(String key)
    {
        Trienode temp=root;
        for(int i=0;i<key.length();i++)
        {
            int idx=key.charAt(i)-'a';
            if(temp.children[idx]==null)    //if null then create a new node.
                temp.children[idx]=new Trienode();
            
            temp=temp.children[idx];  
            temp.countPrefix++;  //Increment the pointer like in linkedlist head=head.next.
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
            //ans=temp.countPrefix;
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
        String s1=sc.next();
        String s2=sc.next();
        if(s1.equals("add"))
            insert(s2);
        else
            System.out.println(prefixCount(s2));
        }
    }
}