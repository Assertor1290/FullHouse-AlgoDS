## Singly Linked List  
Linked List is a linear data structure. The elements are linked using pointers. 
  
**Why Linked List?**  
1) The size of the arrays is fixed.  
2) Inserting a new element in an array of elements is expensive because the room has to be created for the new elements and to create room existing elements have to be shifted.  
  
**Drawbacks**  
1) Random access is not allowed. We have to access elements sequentially starting from the first node.
2) Extra memory space for a pointer is required with each element of the list.
3) Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.  
  
**Representation**  
A linked list is represented by a pointer to the first node of the linked list. The first node is called the **head**. If the linked list is empty, then the value of the head is NULL.
Each node in a list consists of at least two parts:
1) data
2) Pointer (Or Reference) to the next node
In Java, LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a reference of Node class type.  
<pre>
class LinkedList { 
    Node head; // head of list 
  
    /* Linked list Node.  This inner class is made static so that main() can access it */
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  
        llist.head = new Node(1); 
        Node second = new Node(2); 
        Node third = new Node(3); 
  
        /* Three nodes have been allocated dynamically. 
          We have references to these three blocks as head,   
          second and third 
  
          llist.head        second              third 
             |                |                  | 
             |                |                  | 
         +----+------+     +----+------+     +----+------+ 
         | 1  | null |     | 2  | null |     |  3 | null | 
         +----+------+     +----+------+     +----+------+ */
  
        llist.head.next = second; // Link first node with the second node 
  
        /*  Now next of the first Node refers to the second.  So they 
            both are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  | null |     |  3 | null | 
        +----+------+     +----+------+     +----+------+ */
  
        second.next = third; // Link second node with the third node 
  
        /*  Now next of the second Node refers to third.  So all three 
            nodes are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ */
    } 
} 
</pre>  

**Linked List Traversal**  
<pre>
class LinkedList { 
    Node head; // head of list 
  
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* This function prints contents of linked list starting from head */
    public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        LinkedList llist = new LinkedList(); 
  
        llist.head = new Node(1); 
        Node second = new Node(2); 
        Node third = new Node(3); 
  
        llist.head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
  
        llist.printList(); 
    } 
}
</pre>  
  
**Additional Points**  
1) In an array, memory is assigned during compile time while in a Linked list it is allocated during execution or runtime.
2) Memory utilization is efficient in the linked list.
3) In general, array is considered a data structure for which size is fixed at the compile time and array memory is allocated either from Data section (e.g. global array) or Stack section (e.g. local array). Linked list is considered a data structure for which size is not fixed and memory is allocated from Heap section (e.g. using malloc() etc.) as and when needed. 
4) Array is taken as a static data structure (residing in Data or Stack section) while linked list is taken as a dynamic data structure (residing in Heap section).  

**Linked List Insertion**  
 A node can be added in three ways:-
1. At the front of the linked list.  
<img src="https://user-images.githubusercontent.com/30290570/90606578-a21d9c80-e21d-11ea-8826-ca75a08b9f98.png">
  2. After a given node.  
<img src="https://user-images.githubusercontent.com/30290570/90606587-a47ff680-e21d-11ea-902f-42fa658e0c15.png">
  3. At the end of the linked list.  
<img src="https://user-images.githubusercontent.com/30290570/90606598-a8137d80-e21d-11ea-8e19-868f060199dd.png">

**Linked List Deletion**  
To delete a node from linked list, we need to do following steps:-
1) Find previous node of the node to be deleted.
2) Change the next of previous node.
3) Free memory for the node to be deleted.  
<img src="https://user-images.githubusercontent.com/30290570/90621260-19a8f700-e231-11ea-93bd-c5df0bb88bd5.png">
