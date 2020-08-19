import java.util.Scanner;

public class LinkedListInsertion {
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
            System.out.print(n.data+ " ");
            n=n.next;
        }
        System.out.println();
    }
    public void insertBeginning(int val){
        // 1 & 2: Allocate the Node & Put in the data
        Node first=new Node(val);
        // 3. Make next of new Node as head
        first.next = head;
        // 4. Move the head to point to new Node
        head = first;
    }
    public void insertAfterNode(int after,int val){
        Node ins;
        ins=head;
        while(ins.data!=after){
            ins=ins.next;
        }
        Node mid=new Node(val);
        mid.next=ins.next;
        ins.next=mid;
    }
    public void insertLast(int val){
        if (head == null)
        {
            head = new Node(val);
            return;
        }
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        Node last=new Node(val);
        n.next=last;
    }
    public static void main(String[] args) {
        int val, after;
        Scanner scanner = new Scanner(System.in);
        LinkedListInsertion linkedListInsertion = new LinkedListInsertion();

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert after given node");
            System.out.println("3. Insert at end");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter value to be inserted");
                    val = scanner.nextInt();
                    linkedListInsertion.insertBeginning(val);
                    linkedListInsertion.printList();
                    break;
                case 2:
                    System.out.println("Enter value after which node will be inserted");
                    after = scanner.nextInt();
                    System.out.println("Enter value to be inserted");
                    val = scanner.nextInt();
                    linkedListInsertion.insertAfterNode(after, val);
                    linkedListInsertion.printList();
                    break;
                case 3:
                    System.out.println("Enter value to be inserted");
                    val = scanner.nextInt();
                    linkedListInsertion.insertLast(val);
                    linkedListInsertion.printList();
                    break;
                default:
                    System.out.println("Wrong choice");
                    System.exit(0);
            }
        }
    }
}
