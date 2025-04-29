**Tree Data Structure** is a hierachical structure that is used to represent data in form parent child relationship

**Basic Terminologies**
**Parent Node**:The node which is an immediate predecessor of a node.
**Child Node**: The node which is an immediate successor of a node.
**Root Node**: The topmost node or the node that doesn't have a parent node. A non-empty tree must contain exactly one root node and exactly one path from the root to all other nodes
**Leaf Node/ External Node**: the nodes which do not have any child.
**Ancestor of a Node**: Any predecessor nodes along the path of the root  to all the other nodes of the tree.
**Descendant**: A node x is a descendant of a node y if y is the ancestor of x.
**Sibling**: Children of the same parent node are called siblings.
**Level of a node**: the count of edges on thepath form the no


**Binary Tree**
It's a non-linear and hierarchical data structure where each node has at most two children referred to as the **left child** and **right child**
Root - topmost node, leaves - bottom-most node.

**Represantation of a Binary Tree**
*image
data
pointer to the right child 
pointer to the left child

**Terminologies in a Binary Tree**
Nodes: The fundamental part of a binary tree, where each node contains data and link to two child nodes.
Root: The topmost node in a tree is known as the root node. It has no parent and serves as the starting point for all nodes in the tree.
Parent Node: A node that has one or more child nodes. In a binary tree, each node can have at most two children.
Child Node: A node that is a descendant of another node (its parent).
Leaf Node: A node that does not have any children or both children are null.
Internal Node: A node that has at least one child. This includes all nodes except the leaf nodes.
Depth of a Node: The number of edges from a specific node to the root node. The depth of the root node is zero.
Height of a Binary Tree: The number of nodes from the deepest leaf node to the root node.

**Properties of binary Tree**
The maximum number of nodes at level L of a binary tree is 2L
The maximum number of nodes in a binary tree of height H is 2H – 1
Total number of leaf nodes in a binary tree = total number of nodes with 2 children + 1
In a Binary Tree with N nodes, the minimum possible height or the minimum number of levels is Log2(N+1)
A Binary Tree with L leaves has at least | Log2L |+ 1 levels


**Types of Binary Trees**
1. **On basis of Number of Children**
   * Full Binary Tree
   * Degenerated Binary Tree
   * Skewed Binary Trees
2. **On basis of Completion of Levels**
   * Full Binary Tree
   * Perfect Binary Tree
   * Balanced Binary Tree
3. **On basis of Node Values**
   * Binary Search Tree
   * AVL Tree
   * Red Black Tree
   * B Tree
   * B+ Tree
   * Segment Tree

**Operations on a Binary Tree**
1. **Traversal**



**Complete Binary Tree**
A special type of binary tree where all the levels of the tree are filled completely except the lowest level nodes which are filled from as left as possible.

**Degree of a Node**: the number of children a node has.

**Properties of Complete Binary Tree**
1. All leaves have the same depth.
2. In a complete binary tree number of nodes at depth d is **2^d**.
3. In a complete binary treewith n nodes, height of the tree is **log(n+1)**.
4. All the levels except the last level are completely full.
