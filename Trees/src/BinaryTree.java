/**
 * Node class
 */
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

/**
 * <p> Class to show Binary Tree structure</p>
 */
public class BinaryTree {
    Node root;

    BinaryTree(){
        root=null;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        //create root
        binaryTree.root=new Node(1);
        /* following is the tree after above statement

              1
            /   \
          null  null     */

        Node two=new Node(2);
        Node three=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);

        binaryTree.root.left=two;
        binaryTree.root.right=three;
        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */

        two.left=fourth;
        fourth.left=fifth;
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          5    null
         /  \
       null null
         */
    }
}
