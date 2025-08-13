package LinkedList;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int value){
        data = value;
        prev = next = null;
    }
}

class DoublyOperations {

    // Forward Traversal
    static void forwardTraversal(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    static void backwardTraversal(Node tail){

        Node curr = tail;

        while (curr != null){
            System.out.print(curr.data + " ");

            curr = curr.prev;
        }

        System.out.println();
    }

    static int findSize(Node curr){
        int size = 0;
        while (curr != null){
            size ++;
            curr = curr.next;
        }
        return size;
    }

    static Node insertAtFront(Node head, int newData){

        Node newNode = new Node(newData);
        newNode.next = head;

        if (head != null){
            head.prev = newNode;
        }

        return newNode;
    }

    static Node insertAtEnd(Node head, int newData){
        Node newNode = new Node(newData);

        // If the linked list is empty set the new node as head
        if (head == null){
            head = newNode;
        }
        else {
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }

            // Set the next of last node to the new node
            curr.next = newNode;

            // Set the prev of the new node to the last node
            newNode.prev = curr;
        }

        return head;
    }

    static Node deleteAtFront(Node head){

        // if empty return null
        if (head == null){
            return null;
        }

        // Store in temp for deletion later
        Node temp = head;

        // Move head to the next node
        head = head.next;

        // Set prev of the new head
        if (head != null)
            head.prev = null;

        return head;
    }

    static Node deleteAtEnd(Node head){

        // Corner cases
        if (head == null)
            return null;
        if (head.next == null)
            return null;

        // Traverse to the last node
        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        // Update the previous node's next pointer
        if (current.prev != null){
            current.prev.next = null;
        }

        return head;
    }

    static Node deleteAtPosition(Node head, int position){

        if (head == null){
            return head; // Are we not supposed to return null here?
        }

        Node current = head;

        // Traverse to the node at the given position
        for (int i = 1; current != null && i < position; ++i){
            current = current.next;
        }

        // if the position is out of range
        if (current == null)
            return head;

        // Update the previous node's next pointer
        if (current.prev != null)
            current.prev.next = current.next;

        // Update the next node's prev pointer
        if (current != null)
            current.next.prev = current.prev;

        // If the node to be deleted is the head node
        if (head == current)
            head = current.next;

        //Deallocate memory for the deleted node
        current = null;
        return head;
    }

    public static void main(String[] args) {

        // Create a hardcoded Doubly linked list;
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Forward Traversal: ");
        forwardTraversal(head);

        System.out.println("Backward Traversal: ");
        backwardTraversal(fifth);

        System.out.println("Size: " + findSize(head));

        System.out.println("\nAfter inserting node at the front: ");
        int data = 0;
        head = insertAtFront(head, data);
        forwardTraversal(head);

        System.out.println("\nAfter inserting at the end: ");
        head = insertAtEnd(head, 6);
        forwardTraversal(head);

        System.out.println("\nAfter deleting at the front: ");
        head = deleteAtFront(head);
        forwardTraversal(head);

        System.out.println("\nAfter Deleting at the end: ");
        head = deleteAtEnd(head);
        forwardTraversal(head);

        System.out.println("\nAfter deleting at a position 2");
        head = deleteAtPosition(head, 2);
        forwardTraversal(head);

    }
}
