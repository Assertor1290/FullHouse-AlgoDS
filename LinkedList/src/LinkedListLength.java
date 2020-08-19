/**
 * <p>Class to find linked  list length</p>
 */
public class LinkedListLength {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){this.data=data;}
    }

    /**
     * Iterative method to find linked list length
     * @return length
     */
    int length(){
        Node n=head;
        int count=0;
        while(n!=null){
            n=n.next;
            count++;
        }
        return count;
    }

    /**
     * Recursive solution to find length
     * @param n head of linked list
     * @return length
     */
    int length2(Node n){

        //base case
        if(n == null)
            return 0;
        // Count is this node plus rest of the list
        return 1+length2(n.next);
    }

    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+ " ");
            n=n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListLength linkedListLength=new LinkedListLength();
        linkedListLength.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        linkedListLength.head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println(linkedListLength.length());
        linkedListLength.printList();

        System.out.println(linkedListLength.length2(linkedListLength.head));
    }
}
