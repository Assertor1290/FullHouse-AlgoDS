import java.util.Stack;

public class DFSMatrix {
    private int V;
    private int[][] adj;
    private final boolean[] visited;

    DFSMatrix(int v){
        V=v;
        adj=new int[V][V];
        visited=new boolean[V];
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
    void DFSRecursive(int s){
        visited[s]=true;
        System.out.print(s+" ");
        for(int i=0;i<adj.length;i++){
            if(adj[s][i]==1 && !visited[i]){
                DFSRecursive(i);
            }
        }
    }
    void DFSIterative(int s){
        boolean[] visited=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        visited[s]=true;
        stack.push(s);
        while (stack.size()!=0){
            s=stack.pop();
            System.out.print(s+" ");
            for(int i=0;i<adj.length;i++){
                if(adj[s][i]==1 && !visited[i]){
                    stack.push(i);
                    visited[i]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        DFSMatrix dfsMatrix=new DFSMatrix(8);
        dfsMatrix.addEdge(4,3);
        dfsMatrix.addEdge(4,5);
        dfsMatrix.addEdge(4,6);
        dfsMatrix.addEdge(3,2);
        dfsMatrix.addEdge(3,0);
        dfsMatrix.addEdge(2,1);
        dfsMatrix.addEdge(5,7);
        dfsMatrix.DFSRecursive(4);
        System.out.println();
        dfsMatrix.DFSIterative(4);
    }
}
