import java.util.*;

public class PrintServer {

    private final Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public int printNextJob() {
        if (printQueue.isEmpty()) {
            throw new NoSuchElementException("No jobs in the queue");
        }
        return printQueue.removeFirst();
    }

    public boolean isEmpty() {
        return printQueue.isEmpty();
    }

    public int pendingCount() {
        return printQueue.size();
    }

    public static void main(String[] args) {
        PrintServer server = new PrintServer();

        server.submitJob(1); 
        server.submitJob(2); 
        server.submitJob(3); 

        System.out.println("Printing: " + server.printNextJob()); 

        server.submitJob(4);      
        server.submitUrgentJob(99); 

        System.out.println("Printing: " + server.printNextJob()); 
        System.out.println("Printing: " + server.printNextJob()); 

        server.submitUrgentJob(100); 
        server.submitUrgentJob(101); 

        System.out.println("Printing: " + server.printNextJob()); 
        System.out.println("Printing: " + server.printNextJob()); 
        System.out.println("Printing: " + server.printNextJob()); 
        System.out.println("Printing: " + server.printNextJob()); 

        try {
            server.printNextJob(); 
        } catch (NoSuchElementException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}