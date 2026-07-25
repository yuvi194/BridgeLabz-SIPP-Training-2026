
public class PacketBuffer {

    private final int[] data;
    private int front;
    private int count;
    private final int capacity;

    public PacketBuffer(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = 0;
        this.count = 0;
    }
    public boolean enqueue(int packetId) {
        if (count == capacity) {
            return false; 
        }
        int rear = (front + count) % capacity; 
        data[rear] = packetId;
        count++;
        return true;
    }

   
    public int dequeue() {
        if (count == 0) {
            throw new IllegalStateException("Buffer empty");
        }
        int val = data[front];
        front = (front + 1) % capacity;
        count--;
        return val;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public int size() {
        return count;
    }

    public int capacity() {
        return capacity;
    }

    
    public static void main(String[] args) {
        PacketBuffer buffer = new PacketBuffer(4);

        System.out.println(buffer.enqueue(101)); 
        System.out.println(buffer.enqueue(102));
        System.out.println(buffer.enqueue(103)); 
        System.out.println(buffer.enqueue(104));
        System.out.println(buffer.enqueue(105)); 

        System.out.println("Processed: " + buffer.dequeue()); 
        System.out.println("Processed: " + buffer.dequeue()); 

        System.out.println(buffer.enqueue(105)); 
        System.out.println(buffer.enqueue(106)); 
        System.out.println(buffer.enqueue(107));

        System.out.println("Processed: " + buffer.dequeue()); 
        System.out.println("Processed: " + buffer.dequeue()); 
        System.out.println("Processed: " + buffer.dequeue()); 
        System.out.println("Processed: " + buffer.dequeue()); 

        try {
            buffer.dequeue(); 
        } catch (IllegalStateException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}