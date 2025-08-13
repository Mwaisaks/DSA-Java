package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListImpl {

    static Queue<Integer> queue = new LinkedList<>();

    static boolean isEmpty(){
        return queue.isEmpty();
    }

    static void enqueue(int data){
        queue.add(data);
    }

    static void dequeue(){
        if (isEmpty())
            return;
        queue.poll();
    }

    static int getFront(){
        if (isEmpty())
            return -1;
        return queue.peek();
    }

    static int getRear(){
        if (isEmpty())
            return -1;
        return ((LinkedList<Integer>)queue).getLast();
    }

    public static void main(String[] args) {

        enqueue(1);
        enqueue(8);
        enqueue(3);
        enqueue(6);
        enqueue(2);

        if (isEmpty()){
            System.out.println("Queue after enqueue operation: ");
            for (int num : queue){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Front: " + getFront());
        System.out.println("Rear: " + getRear());

        System.out.println("Queue size: " + queue.size());

        dequeue();

        System.out.println("Is queue empty? " + (isEmpty() ? "Yes" : "No"));
    }
}
