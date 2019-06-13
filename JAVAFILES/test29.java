import java.io.*;
import java.util.HashMap;
 
// This class represents a directed graph using adjacency list
// representation
class test29
{
public static void main(String args[])
{
     /*LinkedList<String> adj[];
        adj = new LinkedList[3];
        for (int i=0; i<3; ++i)
            adj[i] = new LinkedList();
        adj["A"].add(1);
        adj["B"].add(2);
        adj["C"].add(3);
        System.out.println(adj);*/
        HashMap<String, String> aMap = new HashMap<String, String>();
        aMap.put("a" ,"B");
        aMap.put("b","C");
        aMap.put("c","d");
        System.out.println(aMap);
}
}