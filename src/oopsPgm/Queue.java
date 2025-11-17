package oopsPgm;

class Node {
    Player data;
    Node next;

    Node(Player data) { this.data = data; }
}

public class Queue {

    private Node front, rear;

    public void enqueue(Player data) {
        Node temp = new Node(data);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public Player dequeue() {
        if (front == null) return null;
        Player data = front.data;
        front = front.next;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
