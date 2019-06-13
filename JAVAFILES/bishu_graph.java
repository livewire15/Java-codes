//package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

 class bishu_graph {
	static int min=6,pos=0,flag;
	public static int dfsHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int startingVertex, HashMap<Integer, Boolean> visited,int num,int flag) {
		int counter=0;
		if(startingVertex==num)
		{
		//System.out.print(startingVertex + " ");
		flag=1;
		visited.put(startingVertex, true);
		ArrayList<Integer> a = adjacencyList.get(startingVertex);
		for(int i : a) {
			if(!visited.containsKey(i)) {
				if(a.get(i)==1)
				{
					if(counter<min)
					{
						min=counter;
						pos=num;
						
					}
					break;
				}
				else
					counter++;
				//dfsHelper(adjacencyList, i, visited);
			}
		}
	}
	return pos;
	}

	public static int printDFSTraversal(HashMap<Integer, ArrayList<Integer>> adjacencyList,int num,int flag) {
		//int pos=0;
		for(int i : adjacencyList.keySet())
		{
			if(flag==1)
				break;
			else
			{
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		pos=dfsHelper(adjacencyList, i, visited,num,flag);
		//System.out.println();
		}
		}
		return pos;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = n-1;
		HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<Integer, ArrayList<Integer>>();

		int count = 1;
		while(count <= e) {
			int source = s.nextInt();
			int dest = s.nextInt();

			if(adjacencyList.containsKey(source)) {
				adjacencyList.get(source).add(dest);
			}
			else {
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(dest);
				adjacencyList.put(source, a);
			}
			if(adjacencyList.containsKey(dest)) {
				adjacencyList.get(dest).add(source);
			}
			else {
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(source);
				adjacencyList.put(dest, a);
			}
			count++;
		}
		System.out.println("Enter q");
		int q=s.nextInt();
		//int pos=0;
		for(int i=0;i<q;i++)
		{
			int num=s.nextInt();
		 pos=printDFSTraversal(adjacencyList,num,0);
		}
		System.out.println(pos);
	}
}