/*
 Implement a queue using a linked list in Java. 
 Include the necessary methods such as enqueue, dequeue, and isEmpty.
*/
 public class Queue<T> 
 {
    private Node<T> front;
    private Node<T> rear;

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //constructor
    public Queue() {
        front = null;
        rear = null;
    }

    // Add an element to the rear of the queue
    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value +" is enqueued");
    }

    // Remove and return the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return null;
        }

        T dequeuedValue = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return dequeuedValue;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued Element:" +queue.dequeue());
        }
    }
}

