A stack is a linear data structure that follows LIFO principle; the last element to be inserted is the first to be popped out. 
Both insertion and deletion happen at one end only.

A stack can be implemented by means of Array, Structure, Pointer, and Linked List.

Types of Stack
FixedSize Stack: has a fixed size, can't grow or shrink dynamically.
If an attempt is made to add an element to an already full stack, an overflow error occurs.
If an attempt is made to remove an element to an empty stack an underflow error occurs.
Dynamic Size Stack: can grow and shrink dynamically.
When the stack is full it automatically increases its size to accommodate the new element.
When the stack is empty it decreases its size. This type is implemented using a linked list as it allows for easy resizing of the stack.

Basic Operations in Stack