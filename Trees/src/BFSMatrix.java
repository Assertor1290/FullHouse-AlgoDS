import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * <p>BFS using adjacency matrix</p>
 */
public class BFSMatrix {
    private int V;
    private int[][] adj;
    BFSMatrix(int v){
        V=v;
        adj=new int[V][V];
        for(int row=0;row<V;row++){
            for(int col=0;col<V;col++){
                adj[row][col]=0;
            }
        }
    }
    void addEdge(int start,int end){
        adj[start][end]=1;
        adj[end][start]=1;
    }
    void BFS(int s){
        boolean[] visited=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            s=queue.poll();
            System.out.print(s+" ");
            for(int i=0;i<adj.length;i++){
                if(adj[s][i]==1 && !visited[i]){
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int vertices,edges;
        System.out.println("Enter number of vertices ");
        vertices=Integer.parseInt(bufferedReader.readLine());
        BFSMatrix bfsMatrix=new BFSMatrix(vertices);
        bfsMatrix.addEdge(3,5);
        bfsMatrix.addEdge(3,2);
        bfsMatrix.addEdge(5,1);
        bfsMatrix.addEdge(2,1);
        bfsMatrix.addEdge(2,4);
        bfsMatrix.addEdge(1,0);
        bfsMatrix.BFS(3);
    }
}
