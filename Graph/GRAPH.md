
A graph is a non-linear data structure consisting of edges and vertices (also nodes)

Graph is denoted by **G(V, E).**

**Representations of Graph**
2 most common ways to represent a graph.
* Adjacency Matrix
* Adjacency List

### Adjacency Matrix Representation
- a way of representing a graph as s matrix of boolean (0's and 1's)

**Applications of Adjacency Matrix**
* **Graph representation**: most common way
* **Connectivity**: determining whether the graph is connected or not. In directed graphs connectivity can be analyzed using concepts like strongly connected components.

**Advantages**
* Simple and easy to implement
* Space efficient for dense graphs, as it requires V*V space to represent the entire graph.
* Faster access to edges: Adjacency Matrix allows constant look up to check whether there exists an edge between a pair of vertices.

**Disadvantages**
* **Space inefficient for Sparse Graphs**: Takes up O(V*V) space even if the graph is sparse.
* **Costly Insertions and Deletions**: Adding or deleting a vertex can be costly as it requires resizing the matrix.
* **Slow Traversals**: Graph traversals like DFS, BFS takes O(V * V) time to visit all the vertices whereas Adjacency List takes only O(V + E).


### Adjacency List Representation
- A data structure used to represent a graph where each node in the graph stores a list of it;s neighbouring vertices.

- An array of lists stores edges between 2 vertices. The size of the array is equal to the number of vertices.
- Each index represents a specific vertex in the graph

**Characteristics of Adjacency List**
* An adjacency list representation uses a list of lists
* The size of the list is determined by the number of vertices in the graph.
* All adjacent of a vertex are easily available.

**Applications**
* Representing graph algorithms

**Advantages**
* Simple and easy to understand
* Requires less space compared to adjacency matrix for sparse graphs
* Easy to traverse through all edges of a graph
* Insertion is easier compared to adjacency matrix representation

**Disadvantages of using an Adjacency list:**
* Checking if there is an edge between two vertices is costly as we have traverse the adjacency list.
* Not suitable for dense graphs.

