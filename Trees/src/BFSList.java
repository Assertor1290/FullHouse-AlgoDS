import java.util.Iterator;
import java.util.LinkedList;

/**
 * <p> BFS using adjacency list representation</p>
 */
public class BFSList {
    //V is number of vertices
    private final int V;
    //Adjacency lists
    //adj is as an array in which element is Linked List type
    //and in which each element is Integer type
    private final LinkedList<Integer>[] adj;

    BFSList(int v){
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i]=new LinkedList<>();
        }
    }

    //Function to add edge in tree
    void addEdge(int v,int w){
        adj[v].add(w);
    }

    //print BFS traversal from given source s
    void BFS(int s){
        //Mark all vertices as not visited (default is false)
        boolean[] visited =new boolean[V];
        //Create a queue for BFS
        LinkedList<Integer> queue=new LinkedList<>();
        //Mark current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            //Dequeue a vertex from queue and print it
            s=queue.poll();
            System.out.print(s+" ");
            //Iterator for each linked list
            Iterator<Integer> i=adj[s].listIterator();
            while (i.hasNext()){
                int n=i.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        /**
         *       0
         *      / \
         *     1   2
         *    /  / |
         *   / /   |
         *   3     4
         *   |
         *   5
         */
        BFSList bfsList=new BFSList(6);
//        bfsList.addEdge(0,1);
//        bfsList.addEdge(0,2);
//        bfsList.addEdge(1,3);
//        bfsList.addEdge(2,3);
//        bfsList.addEdge(2,4);
//        bfsList.addEdge(3,5);
        /**
         *       3
         *      / \
         *     5   2
         *    /  / |
         *   / /   |
         *   1     4
         *   |
         *   0
         */
        /**
         *            0     1    2    3    4    5
         *    adj   |    |    |    |    |    |    |
         *            |    |    |    |    |    |
         *            |    |    |    |    |    |
         *            |    |    |    |    |    |
         *                0     1    5         1
         *                      |    |
         *                      4    2
         *
         */
        bfsList.addEdge(3,5);
        bfsList.addEdge(3,2);
        bfsList.addEdge(5,1);
        bfsList.addEdge(2,1);
        bfsList.addEdge(2,4);
        bfsList.addEdge(1,0);
        System.out.println("Following is Breadth First Traversal ");
        //Pass the source vertex
        bfsList.BFS(3);
    }
}
