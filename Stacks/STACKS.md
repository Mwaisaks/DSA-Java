A stack is a linear data structure that follows LIFO principle; the last element to be inserted is the first to be popped out. 

Both insertion and deletion happen at one end only.

A stack can be implemented by means of Array, Structure, Pointer, and Linked List.

**Types of Stack**
1. **FixedSize Stack**: has a fixed size, can't grow or shrink dynamically.
If an attempt is made to add an element to an already full stack, an overflow error occurs.
If an attempt is made to remove an element to an empty stack an underflow error occurs.
2. **Dynamic Size Stack**: can grow and shrink dynamically.
When the stack is full it automatically increases its size to accommodate the new element.
When the stack is empty it decreases its size. This type is implemented using a linked list as it allows for easy resizing of the stack.

**Basic Operations in Stack**
* push()
* pop()
* peek() - gets the top ata element of the stack without removing it.
* isFull()
* isEmpty()

A pointer is maintained to the last pushed data on the stack

**Push Operation**
- Adds an item to the stack
**Algorithm**
1. Check if the stack is **full**.
2. If the stack is full **(top == capacity-1)**, then **Stack Overflows** exit.
3. Otherwise, increment the value of top by 1 **(top = top + 1)** and the new value is inserted at top position.
4. The elements can be pushed into the stack till we reach the capacity of the stack

**Pop Operation**
- Removes an element from the stack.
**Algorithm**
1. Check if the stack is empty.
2. If the stack is empty **(top == -1)**, then **Stack Underflows** and exit.
3. Otherwise, access the data element at which top is pointing.
4. decrement the value of top by 1 **(top = top - 1)** and return the stored top value or success

**Peek Operation**
- Returns the top element of the stack.
**Algorithm**
1. Check if the stack is empty **(top == -1)**.
2. If empty, print "Stack is empty".
3. Otherwise, return the element stored at **index = top**

**isEmpty Operation**
- returns true if the stack is empty, else false.
**Algorithm**
1. Check for the value of top in stack.
2. if **(top == -1)**, return **true**, else return **false**

**isFull Operation**
- returns true if the stack is full, else false.
**Algorithm**
1. Check for the value of top in stack.
2. if **(top == capacity - 1)**, return true, else return false.


The complexity analysis of all operations in stack is O(1).

**Applications of Stack**
Function calls
Recursion


**Advantages of stacks**
Simplicity - simple and easy to understand.
Efficiency - push and pop operations can be performed in constant time (O(1)).
LIFO - this behaviour is useful in many scenarios e.g. function calls and expression evaluation.
Limited memory usage - Stacks only need to store the elements that have been pushed onto them, making them memory-efficient compared to other data structures.

**Disadvantages of Stack**
Limited access - elements can only be accessed from the top, making it difficult to retrieve or modify elements in the middle of the stack.
Potential for overflow - if more elements are pushed into the stack than it can hold, an overflow error will occur, resulting in a loss of data.
Not suitable for random access - unsuitable for applications where elements need to be accessed ina specific order.
Limited capacity - fixed capacity(array implementation) which can be a limitation if the number of elements that need to be stored is unknown or highly variable


