
package graphs;
import java.util.*;

public class dfs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 7; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,0,2); 
        	addEdge(adj,2,3); 
        	addEdge(adj,1,3); 
        	addEdge(adj,1,4);
        	addEdge(adj,3,4);
        	addEdge(adj,5,6); //making graph disconnected.
		
		System.out.println("Following is Depth First Traversal: "); 
		
		 boolean[] vis=new boolean[V]; 
		
	    int count=0;
		 for(int i=0; i<V; i++)
		 {
			 if(vis[i]==false)
			 {
				 count++;
				 DFS(adj,i,vis); 
			 }
		 }
	
		 System.out.println("Number of connected component is " + count);
		 DFS(adj,0,vis);
	}
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

	static void DFS(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited) 
	{ 
    	visited[s]=true;
        System.out.print(s +" ");
        
        for(int u:adj.get(s)){
            if(visited[u]==false)
                DFS(adj,u,visited);
        } 
	} 
	// adj 
//	0 - 1,2
//	1 - 0,3,4
//	2 - 0,3
//	3 - 2,1,4
//	4 - 1,3
}
