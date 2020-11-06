import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>Node class</p>
 */
class NodeInsert{
    int value;
    NodeInsert left,right;
    NodeInsert(int value){
        this.value=value;
        left=right=null;
    }
}
/**
 *<p>Class to insert Node</p>
 */
public class InsertBT {
    NodeInsert root;
    InsertBT(){
        root=null;
    }
    //Function for inorder traversal
    void inorder(NodeInsert root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    //Function to insert element in Binary Tree
    void insertBinaryTree(NodeInsert temp,int key){
        //If tree is empty, create root of tree
        if(temp==null){
            root=new NodeInsert(key);
            return;
        }
        Queue<NodeInsert> queue=new LinkedList<>();
        queue.add(temp);
        while (!queue.isEmpty()){
            temp=queue.poll();
            if(temp.left==null){
                temp.left=new NodeInsert(key);
                break;
            }
            else {
                queue.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new NodeInsert(key);
                break;
            }
            else {
                queue.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        InsertBT insertBT=new InsertBT();
        insertBT.root=new NodeInsert(10);
        insertBT.root.left=new NodeInsert(11);
        insertBT.root.left.left=new NodeInsert(7);
        insertBT.root.right=new NodeInsert(9);
        insertBT.root.right.left=new NodeInsert(15);
        insertBT.root.right.right=new NodeInsert(8);
        System.out.println("Inorder traversal is ");
        insertBT.inorder(insertBT.root);
        System.out.println();
        int key=12;
        insertBT.insertBinaryTree(insertBT.root,key);
        insertBT.inorder(insertBT.root);
    }
}
