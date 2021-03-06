## Binary Tree  
  
Tree is a hierarchial data structure.  
  
**Tree Vocabulary**  
The topmost node is called root of the tree. The elements that are directly under an element are called its children. The element directly above something is called its parent.  Elements with no children are called leaves.  
* Height = from bottom to top
* Depth = from top to bottom
* Level = depth+1
  
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
1) The maximum number of nodes at level ‘l’ of a binary tree is 2^(l-1).
Here level is number of nodes on path from root to the node (including root and node). Level of root is 1.
  
 <pre>
                                   o(depth=0, height=3, lev=1)
                                 /   \
      (depth=1, height=2, lev=2)o     o(depth=1, height=1, lev=2)
                               /     / \
    (depth=2, height=1, lev=3)o     o   o(depth=2, height=0, lev=3)
                             /  
  (depth=3, height=0, lev=4)o
</pre>  

2) A complete binary tree can have 2^h minimum number nodes or 2^(h+1)-1 maximum number of nodes.
<pre>
                <img height="250" width="250" src="https://user-images.githubusercontent.com/30290570/90715906-32fd8200-e2c9-11ea-9876-426d348153e2.png">                 <img height="250" width="250" src="https://user-images.githubusercontent.com/30290570/90715900-30029180-e2c9-11ea-9b19-6443b3f97e55.png">
</pre>
  
3) In a Binary Tree with N nodes, minimum possible height is Log2(N+1)-1.  
  
4) In Binary tree where every node has 0 or 2 children, number of leaf nodes is always one more than nodes with two children.
<pre>
   L = T + 1
Where L = Number of leaf nodes
      T = Number of internal nodes with two children  
</pre>
