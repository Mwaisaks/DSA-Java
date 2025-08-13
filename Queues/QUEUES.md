It's a linear data structure that follows the **FIFO** (First In First Out) principle.

The first element to be added will be the first to be removed or processed.

**Basic Terminologies**
* **Front/Head**: the first entry.
* **Rear/Back/Tail**: the last entry.
* **Size**: current number of elements in the queue.
* **Capacity**: maximum number of elements the queue can hold.

**Queue Operations**
1. **Enqueue**: adding an element at the end of the queue. If the queue us full, an overflow error occurs
2. **Dequeue**: removing an element from the queue. If the queue is empty and underflow error occurs.
3. **Peek/Front**: returns the element at the front without removing it.
4. **Size**: returns the number of elements in the queue.
5. **isEmpty**: returns true if the queue is empty, otherwise false.
6. **isFull**: returns true if the queue is full, otherwise false.

![img.png](img.png)

**Types of Queues**
1. **Simple Queue**: follows FIFO structure, implemented using either a linked list or a circular array.
2. **Double-Ended Queue (Deque)**: Insertion and deletion can be done from any of the both ends. 2 types:
* **Input-restricted End**: Input can be taken from only one end but deletion can be done from any of the ends.
* **Output-Restricted End**: Output can be done one end but input can be taken from both ends.
3. **Priority Queue**: A queue where the elements are accessed based on the priority assigned to them.
* **Ascending Priority Queue**: elements are arranged in increasing order of their priority values.
Elements with smallest priority values are popped first.
* **Descending Priority Queue**: elements are arranged in decreasing order of their priority values
Element with largest priority eis popped first.

![img_1.png](img_1.png)

**Applications of Queue Data Structure**
1. **Multiprogramming**: when multiple programs run in the memory they need to be organised in queues
2. **Network**: a queue is used in devices such as routers and switch.
   Also used in a mail queue which is a directory that stores data and controls files for mail messages.
3. **Job scheduling**:The computer has a task to execute a particular number of jobs that are scheduled to be executed one after another. These jobs are assigned to the processor one by one which is organized using a queue.
4. **Shared resources**: queues are used as waiting lists for a single shared resource.

**Real Time Applications**
1. Working as a buffer between a slow and a fast device. For example keyboard and CPU, and two devices on network.
2. ATM Booth Line
3. Ticket Counter Line
4. CPU task scheduling
5. Waiting time of each customer at call centers.

**Advantages of Queues**
1. A large amount of data can be managed efficicently with ease.
2. Operations such as insertion and deletion can be performed with ease as it follows the FIFO rule
3. Queues are useful when a particular service is used by multiple consumers.
4. Queues are fast in speed for data inter-process communication.
5. Queues can be used in the implementation of other data structures

**Disadvantages**
1. The operations such as insertion and deletion in the middlw are time consuming.
2. In a classical queue, a new element can only be inserted once the exixting elements are deleted from the queue.
3. Searching an element takes O(N) time.
4. Maximum size of a queue must be defined prior in case of array implementation.

    
**Note** Array implementation of queue is not used in practice as it is not efficient.

In practice we use either Linked list or circular array implementation of queue.
