/**
 * Class to build a linked list and traverse its elements
 */
public class LinkedListTraversal {
    Node head;

    /**
     * Node class
     * data: value to be stored
     * next: pointer to Node of similar type
     */
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

    /**
     * Function to traverse linked list
     */
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListTraversal linkedListTraversal=new LinkedListTraversal();
        linkedListTraversal.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        linkedListTraversal.head.next=second;
        second.next=third;

        linkedListTraversal.printList();
    }
}
