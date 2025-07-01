Algorithms
A set of step by step instructions that are required to solve a given problem or achieve a desired goal.

**Categories**
1. Search
2. Sort
3. Update
4. Insert 
5. Delete
6. Traverse

**Characteristics of an Algorithm**
* Unambiguous - clear and concise
* Input - 0 or more
* Output - 1 or more 
* Feasible - with the available resources
* Independent - of the P.L
* Finite - complete after a finite number of steps

Algorithms are written in Pseudocode and Flowcharts

**Algorithm Analysis**
- Evaluating the performance of algorithms and programs. 
Efficiency is measured in terms of time and space.
- determination of the amount of time and space resources required to execute it.

In 2 stages:
1. **Priori Analysis**
Theoretical Analysis. 
Determined while assuming other factors e.g. processor speed are constant and have no effect on implementation.

2. **Posterior Analysis.**
Empirical Analysis
The algorithm is implemented using a P.L and then executed on a target machine, actual stats are collected; time and space

**Asymptotic Analysis**
Computing the running time of any operation in mathematical units of computation. 
It is input bound i.e if there's no input to the algorithm, it's concluded to work in a constant time.

**Does it Always Work?**

https://www.geeksforgeeks.org/asymptotic-notation-and-analysis-based-on-input-size-of-algorithms/

1. **Worst Case**
- Most commonly used analysis of algorithms
- Calculate the upper bound on the running time of an algorithm - the case that causes the max number of operations to be executed.

2. **Best Case**
- Rarely used
- Calculate the lower bound on the running time of an algorithm.
-the case that causes a min number of operations.

3. **Average Case**
- Rarely used

Types of Asymptotic Annotations
* Theta notation- reps the upper and lower bound of an algorithm- used for average case complexity of an algorithm.
* Big-O Notation - rep the upper bound, provides the worst case.
* Omega Notation - rep the lower bound of an algorithm, provides the best case

**Logic Building**

- Creating clear, step-by-step methods to solve problems using simple rules and principles

**Tips**
Understand the Problem statement.
Generate examples: Create additional input and output cases for each problem.
Draw observations and patterns based on the examples you created
Start with basic ways to solve the problem and apply further conditions.

Try these problems for a start: https://www.geeksforgeeks.org/logic-building-problems/

**Expression Parsing**
**Notation** can be defined as a way of writing mathematical expression.
3 types based on how the operator is used;
* Infix notation
* Prefix (Polish) notation
* Postfix (Reverse-Polish) notation

**Infix notation** 
Operators are used in between operands ie a + b
not suitable for computers; could be difficult and costly in terms of time and space consumption.

**Prefix notation also Polish notation**
Operator is written ahed of operands +ab

**Postfix notation also Reversed Polish Notation**
ab+

**Parsing Expression**
for efficiency infix notations are converted to prefix or postfix and then computed. 
To parse an arithmetic expression we look into operator precedence and associativity.

**Precedence**
Which operator goes first.

**Associativity**
Associativity describes the rule where operators with the same precedence appear in an
expression. 

![img.png](img.png)


**Searching Algorithms**
2 most common algorithms
1. Linear Search
2. Binary Search




##### Youtube Takeaways
**Abstract Data Types**
1. **Arrays**
Values, index, memory address

**Operations**
Read - easy 
Search
Insertion

Sorted Arrays

**Time Complexity**
Algorithm - a set of instructions 
Algorithm analysis

