import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * <p>DFS using Adjacency List representation</p>
 */
public class DFS {
    //number of vertices
    private final int V;
    //Adjacency List
    private final LinkedList<Integer>[] adj;
    //boolean array
    private final boolean[] visited;

    DFS(int v){
        V=v;
        adj=new LinkedList[V];
        visited=new boolean[V];
        for (int i=0;i<V;i++){
            //Each element of adj is a Linked List
            adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int v,int w){
        adj[v].add(w);
    }

    //Recursive approach of DFS
    void DFSRecursive(int s){
        visited[s]=true;
        System.out.print(s+" ");

        Iterator<Integer> iterator=adj[s].listIterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            //Recursively travel along a path
            if(!visited[n])
                DFSRecursive(n);
        }
    }

    //Iterative approach for DFS
    void DFSIterative(int s){
        boolean[] visited=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        visited[s]=true;
        stack.push(s);
        while (stack.size()!=0){
            s=stack.pop();
            System.out.print(s+" ");
            Iterator<Integer> iterator=adj[s].listIterator();
            while (iterator.hasNext()){
                int n=iterator.next();
                if(!visited[n]){
                    visited[n]=true;
                    stack.push(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs=new DFS(5);
        dfs.addEdge(4,3);
        dfs.addEdge(4,0);
        dfs.addEdge(4,1);
        dfs.addEdge(3,2);
        dfs.addEdge(0,2);
        dfs.addEdge(1,2);
        dfs.DFSRecursive(4);
        System.out.println();
        dfs.DFSIterative(4);
    }
}
