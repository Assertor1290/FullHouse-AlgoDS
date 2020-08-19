## Binary Tree  
  
Tree is a hierarchial data structure.  
  
**Tree Vocabulary**  
The topmost node is called root of the tree. The elements that are directly under an element are called its children. The element directly above something is called its parent.  Elements with no children are called leaves.  
  
**Why Trees?**  
1. One reason to use trees might be because you want to store information that naturally forms a hierarchy. For example, the file system on a computer.
2. Trees (with some ordering e.g., BST) provide moderate access/search (quicker than Linked List and slower than arrays).
3. Trees provide moderate insertion/deletion (quicker than Arrays and slower than Unordered Linked Lists).
4. Like Linked Lists and unlike Arrays, Trees don’t have an upper limit on number of nodes as nodes are linked using pointers.  
  
**Binary Tree**  
A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child.  
A tree is represented by a pointer to the topmost node in tree. If the tree is empty, then value of root is NULL.
A Tree node contains following parts.
1. Data
2. Pointer to left child
3. Pointer to right child

**Properties of Binary Tree**  
1) The maximum number of nodes at level ‘l’ of a binary tree is 2^l.
Here level is number of nodes on path from root to the node (including root and node). Level of root is 0.
Since in Binary tree every node has at most 2 children, next level would have twice nodes, i.e. 2 * 2l.  
  
  
