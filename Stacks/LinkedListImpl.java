package Stacks;

class Node{
    int data;
    Node next;

    Node(int new_data){
        this.data = new_data;
        this.next = null;
    }
}

class Stac{

    Node head;

    Stac(){
        this.head = null;
    }

    // Check if stack is empty
    boolean isEmpty(){
        return head == null;
    }

    // Push an element onto stack
    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Pop the element
    void pop(){
        if (isEmpty())
            return;
        head = head.next;
    }

    // Return the top element
    int peek(){
        if (!isEmpty())
            return head.data;
        return Integer.MIN_VALUE;
    }
}

public class LinkedListImpl {

    public static void main(String[] args) {
        Stac stac = new Stac();

        stac.push(11);
        stac.push(22);
        stac.push(33);
        stac.push(44);

        System.out.println(stac.peek());

        stac.pop();
        stac.pop();

        System.out.println(stac.peek());
    }
}
