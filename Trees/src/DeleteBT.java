import java.util.LinkedList;
import java.util.Queue;

class DeleteNode{
    int value;
    DeleteNode left,right;
    DeleteNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class DeleteBT {
    DeleteNode root;
    DeleteBT(){
        root=null;
    }
    void inorder(DeleteNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    void deleteDeepest(DeleteNode root,DeleteNode delNode){
        Queue<DeleteNode> queue=new LinkedList<>();
        queue.add(root);
        DeleteNode temp=null;
        while (!queue.isEmpty()){
            temp=queue.poll();
            if(temp==delNode){
                temp=null;
                return;
            }
            if(temp.right!=null){
                if(temp.right==delNode){
                    temp.right=null;
                    return;
                }
                else queue.add(temp.right);
            }
            if(temp.left!=null){
                if(temp.left==delNode){
                    temp.left=null;
                    return;
                }
                else queue.add(temp.left);
            }
        }
    }
    void deleteBinaryTree(DeleteNode root,int key){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(root.value==key)
                return;
            else
                return;
        }
        DeleteNode temp=null, second=null;
        Queue<DeleteNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            temp=queue.poll();
            if(temp.value==key)
                second=temp;
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        if(second!=null){
            int x=temp.value;
            deleteDeepest(root,temp);
            second.value=x;
        }
    }
    public static void main(String[] args) {
        DeleteBT deleteBT=new DeleteBT();
        deleteBT.root=new DeleteNode(10);
        deleteBT.root.left=new DeleteNode(11);
        deleteBT.root.left.left=new DeleteNode(7);
        deleteBT.root.left.right=new DeleteNode(12);
        deleteBT.root.right=new DeleteNode(9);
        deleteBT.root.right.left=new DeleteNode(15);
        deleteBT.root.right.right=new DeleteNode(8);
        System.out.println("Inorder traversal is ");
        deleteBT.inorder(deleteBT.root);
        System.out.println();
        int key=11;
        deleteBT.deleteBinaryTree(deleteBT.root,key);
        deleteBT.inorder(deleteBT.root);
    }
}
