public class LinkedListReversal {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data);
            n=n.next;
        }
        System.out.println();
    }
    public void reverseNode(){
        Node next,previous=null;
        Node current=head;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }
    public static void main(String[] args) {
        LinkedListReversal linkedListReversal=new LinkedListReversal();
        linkedListReversal.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);

        linkedListReversal.head.next=second;
        second.next=third;
        third.next=fourth;

        linkedListReversal.printList();
        linkedListReversal.reverseNode();
        linkedListReversal.printList();
    }
}
