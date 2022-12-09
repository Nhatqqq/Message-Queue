public class Queue {
    int first, last, size;
    int capacity;
    Message messages[];

    public Queue(int capacity) {
        this.capacity = capacity;
        first = this.size = 0;
        last = capacity - 1;
        messages = new Message[this.capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(Message item) {
        if (isFull(this)) {
            System.out.println("The Queue is full!");
            return;
        }
        this.last = (this.last + 1) % this.capacity;
        this.messages[this.last] = item;
        this.size = this.size + 1;
        System.out.println("Enqueue Successfully!");
    }

    // Method to remove an item from queue.
    // It changes front and size
    Message dequeue() {
        if (isEmpty(this)) {
            System.out.println("The Queue is empty!");
            return null;
        }
        Message item = this.messages[this.first];
        this.first = (this.first + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println("Dequeue Successfully!");
        return item;
    }

    // Method to show all the item in the queue.
    void display() {
        int i;
        if (isEmpty(this)) {
            System.out.println("No Message!");
            return;
        }
        System.out.println("All the message you just input:");
        System.out.println("-----------------------------------------------");
        for (i = first; i <= last; i++) {
            System.out.println(
                    "The message from " + messages[i].getPerson() + " and the message is: " + messages[i].getData());
        }
        System.out.println("");
        return;
    }
}
