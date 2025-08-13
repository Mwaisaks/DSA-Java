package Stacks;

class Stack{

    int top, capacity;
    int[] array;

    public Stack(int capacity){
        this.capacity = capacity;
        top = -1;
        array = new int[capacity];
    }

    public boolean push(int x){
        if (top >= capacity - 1){
            System.out.println("Stack Overflow1");
            return false;
        }

        array[++top] = x;
        return true;
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack Underflow!");
            return -1;
        }

        return array[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }

    public int peek(){
        return array[top];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("\nElements in stack: ");
        for (int i = top; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayImpl {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(12);
        stack.push(43);
        stack.push(63);
        stack.push(75);
        stack.push(81);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("\nTop Element is " + stack.peek());

        stack.display();
    }
}
