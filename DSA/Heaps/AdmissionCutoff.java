import java.util.PriorityQueue;
public class AdmissionCutoff {
    public static int findKthLargest(int[] scores, int k) {
        if (scores == null || scores.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input or k exceeds applicant pool size.");
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int score : scores) {
            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }
        return minHeap.peek();
    }
}
