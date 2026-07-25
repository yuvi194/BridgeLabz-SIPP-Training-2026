import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKCustomerTracker {

    public static List<Integer> topKLargest(int[] transactions, int k) {
        if (k <= 0 || transactions.length == 0) {
            return new ArrayList<>();
        }

       PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {
            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
            }

        return new ArrayList<>(minHeap);
    }
}

