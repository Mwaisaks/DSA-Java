## Searching Algorithms
Used to locate specific data within a collection of data.

### Linear Search
Used for unsorted array. 
It mainly does one by one comparison of the item to be search with array elements

It takes linear time. O(n)

**Time Complexity**

* Best Case: In the best case, the key might be present at the first index. 
So the best case complexity is O(1)
* Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. 
So the worst-case complexity is O(N) where N is the size of the list.
* Average Case: O(N)

Auxiliary Space: O(1) as except for the variable to iterate through the list, no other variable is used.

### Binary Search

It is used for a sorted array. It mainly compares the array's middle element first and if the middle element is same as input, then it returns. 
Otherwise it searches in either left half or right half based on comparison result (Whether the mid element is smaller or greater). 
This algorithm is faster than linear search and takes O(Log n) time.

To use Binary Search:
* The data structure must be sorted.
* Access to any element of the data structure should take constant time.

**Binary Search Algorithm**

* Divide the search space into two halves by finding the middle index "mid". 
* Compare the middle element of the search space with the key. 
* If the key is found at middle element, the process is terminated.
* If the key is not found at middle element, choose which half will be used as the next search space.

-> If the key is smaller than the middle element, then the left side is used for next search.

-> If the key is larger than the middle element, then the right side is used for next search.
* This process is continued until the key is found or the total search space is exhausted.

**Time Complexity** 
-> Best Case: O(1)

-> Average Case: O(log N)

-> Worst Case: O(log N)

**Auxiliary Space**: O(1), If the recursive call stack is considered then the auxiliary space will be O(log N).

### Interpolation Search

