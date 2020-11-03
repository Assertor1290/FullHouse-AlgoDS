class NodeTrav{
    int value;
    NodeTrav left,right;
    NodeTrav(int value){
        this.value=value;
        left=right=null;
    }
}

/**
 *              1
 *            /  \
 *           2    3
 *          / \
 *         4  5
 */
public class TreeTraversal {
    NodeTrav root;
    TreeTraversal(){
        root=null;
    }
    public void inorder(NodeTrav root){
        if (root==null) return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public void preorder(NodeTrav root){
        if (root==null) return;
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(NodeTrav root){
        if (root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[] args) {
        TreeTraversal treeTraversal=new TreeTraversal();
        treeTraversal.root=new NodeTrav(1);
        treeTraversal.root.left=new NodeTrav(2);
        treeTraversal.root.right=new NodeTrav(3);
        treeTraversal.root.left.left=new NodeTrav(4);
        treeTraversal.root.left.right=new NodeTrav(5);
        System.out.println("Inorder traversal of tree is");
        treeTraversal.inorder(treeTraversal.root);
        System.out.println("\n Postorder traversal of tree is");
        treeTraversal.postorder(treeTraversal.root);
        System.out.println("\n Preorder traversal of tree is");
        treeTraversal.preorder(treeTraversal.root);
    }
}
