import java.util.Scanner;

/**
 * <p>Class to show linked list deletion</p>
 * <p>Delete a given key</p>
 */
public class LinkedListDeletion {
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
    /* Given a key, deletes the first occurrence of key in linked list */
    public void deleteNode(int val){
        Node temp=head;
        Node previous=null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == val)
        {
            head = temp.next; // Changed head
            return;
        }
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while(temp!=null && temp.data!=val){
            previous=temp;
            temp=temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        previous.next=temp.next;

    }
    public static void main(String[] args) {
        LinkedListDeletion linkedListDeletion=new LinkedListDeletion();
        linkedListDeletion.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);

        linkedListDeletion.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of node to be deleted  ");
        int del=scanner.nextInt();
        linkedListDeletion.deleteNode(del);
        linkedListDeletion.printList();
    }
}
