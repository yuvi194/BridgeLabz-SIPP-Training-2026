import java.util.*;

public class ERTriageSystem {

    static class Patient {
        int priority; 
        String name;
        long arrivalOrder; 

        Patient(int priority, String name, long arrivalOrder) {
            this.priority = priority;
            this.name = name;
            this.arrivalOrder = arrivalOrder;
        }

        @Override
        public String toString() {
            return name + " (priority=" + priority + ")";
        }
    }

    private final PriorityQueue<Patient> triageQueue =
        new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority) {
                return a.priority - b.priority; 
            }
            return Long.compare(a.arrivalOrder, b.arrivalOrder); 
        });

    private long arrivalCounter = 0;

    
    public void admitPatient(int priority, String name) {
        triageQueue.offer(new Patient(priority, name, arrivalCounter++));
    }

   
    public Patient callNextPatient() {
        if (triageQueue.isEmpty()) {
            throw new NoSuchElementException("No patients waiting");
        }
        return triageQueue.poll();
    }

    
    public Patient peekNextPatient() {
        if (triageQueue.isEmpty()) {
            throw new NoSuchElementException("No patients waiting");
        }
        return triageQueue.peek();
    }

    public boolean isEmpty() {
        return triageQueue.isEmpty();
    }

    public int waitingCount() {
        return triageQueue.size();
    }

    
    public static void main(String[] args) {
        ERTriageSystem er = new ERTriageSystem();

        er.admitPatient(3, "Alice");   
        er.admitPatient(1, "Bob");     
        er.admitPatient(5, "Carol");   
        er.admitPatient(2, "Dave");   
        er.admitPatient(1, "Eve");     

        System.out.println("Next up: " + er.peekNextPatient()); 

        System.out.println("Calling: " + er.callNextPatient()); 
        System.out.println("Calling: " + er.callNextPatient()); 
        System.out.println("Calling: " + er.callNextPatient());
        System.out.println("Calling: " + er.callNextPatient());
        System.out.println("Calling: " + er.callNextPatient());

        try {
            er.callNextPatient(); 
        } catch (NoSuchElementException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}