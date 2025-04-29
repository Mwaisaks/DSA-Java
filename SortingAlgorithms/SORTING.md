**Sorting Algorithms**
Refers to rearrangement of a given array or list of elements according to a comparison operator on the elements. The comparison operator is used to decide the new order of elements in the respective data structure.

**Sorting Basics**
* **In-place Sorting**: Uses constant space for producing the output; modifys the given array only e.g. Selection Sort, Bubble Sort, Insertion Sort and Heap Sort.
* **Internal Sorting** is when all the data is placed in the main memory or internal memory. In internal sorting, the problem cannot take input beyong allocated memory size.

* **External Sorting** is when all the data that needs to be sorted does not need to be placed in memory at a time. 
External sorting is used for massive amount of data e.g. Merge Sort can be used in external sorting as the whole array does not have to be present all the time in memory.
* **Stable Sorting**: When two same items appear in the same order in sorted data as in the original array called stable sort. Examples: Merge Sort, Insertion Sort, Bubble Sort.
* **Hybrid**

**Types of Sorting Techniques**
* Comparison-based
* Non-comparison

**Selection Sort**
- A comparison-based algorithm
- It
 sorts an array by repeatedly selecting the smalllest(or largest) element from the unsorted portion and swapping it with the first unsorted element. The process is repeated until the array is sorted.

 **Complexity Analysis of Selection Sort**
 **Time Complexity: O(n^2)** ,as there a re two nested loops;
 * One loop to select an element of array one by one = O(n)
 * Another loop to compare that element with every other Array element = O(n)
 * Therefore overall complexity = O(n) * O(n) = O(n*n) = O(n2)

 **Auxiliary Space:** O(1) as the only extra memory used is for temporary variables.

 **Advantages of Selection Sort**
* Easy to understand and implement, making it ideal for teaching basic sorting concepts.
* Requires only a constant O(1) extra memory space.
* It requires less number of swaps (or memory writes) compared to many other standard algorithms. Only cycle sort beats it in terms of memory writes. Therefore it can be simple algorithm choice when memory writes are costly.

**Disadvantages of Selection Sort**
* Selection sort has a time complexity of O(n^2) makes it slower compared to algorithms like Quick Sort or Merge Sort.
* Does not maintain the relative order of equal elements which means it is not stable.

**Applications of Selection Sort**
* Perfect for teaching sorting mechanisms and algorithm design.
* Suitable for small lists where the overhead of more complex algorithms isn't justified.
* Heap Sort algorithm is based on Selection Sort

**Q: How does Selection Sort differ from Bubble Sort?**
Selection Sort selects the minimum element and olaces it in the correct position with fewer swaps while bubble sort repeatedly swaps adjacent elements to sort the array.

**Bubble Sort**
