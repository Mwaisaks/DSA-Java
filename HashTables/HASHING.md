# Hash Tables

**Hashing**

**Components of Hashing**
1. **Key:** A Key can be anything string or integer which is fed as input in the hash function the technique that determines an index or location for storage of an item in a data structure.
2. **Hash Function:** Receives the input key and returns the index of an element in an array called a hash table. The index is known as the hash index .
3. **Hash Table:** Hash table is typically an array of lists. It stores values corresponding to the keys. Hash stores the data in an associative manner in an array where each data value has its own unique index. 

**Hash Function**

A hash function creates a mapping from an input key to an index in hash table, this is done through math formulas know as **hash functions**.

A good hash function should have the following properties:

* Efficient
* Should uniformly distribute the keys to each index of hash table.
* Should minimize collisions (This and the below are mainly derived from the above 2nd point)
* Should have a low load factor (number of items in the table divided by the size of the table). 

**Collision in Hashing**

When two or more keys have the same hash value, a collision happens.

The probability of a hash collision depends on the size of the algorithm, the distribution of hash values and the efficiency of Hash function. 
To handle this collision, we use **Collision Resolution Techniques**. 

**Load Factor in Hashing**

`Load Factor = Total elements in hash table/ Size of hash table`

Load factor is the decisive parameter that is used when we want to rehash the previous hash function or want to add more elements to the existing hash table.

It helps us in determining the efficiency of the hash function i.e. it tells whether the hash function which we are using is distributing the keys uniformly or not in the hash table.

**Rehashing**
hashing again. 

Basically, when the load factor increases to more than its predefined value (the default value of the load factor is 0.75), the complexity increases. 
So to overcome this, the size of the array is increased (doubled) and all the values are hashed again and stored in the new double-sized array to maintain a low load factor and low complexity.

**Collision Resolution Techniques**
1. **Separate Chaining**
The idea behind Separate Chaining is to make each cell of the hash table point to a linked list of records that have the same hash function value. 
Chaining is simple but requires additional memory outside the table. 
2. **Open Addressing**

