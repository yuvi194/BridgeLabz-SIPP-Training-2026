import java.util.*;

public class NetworkThroughputMonitor {

    public static int[] maxThroughputWindow(int[] readings, int k) {
        int n = readings.length;
        if (n == 0 || k <= 0 || k > n) {
            throw new IllegalArgumentException("Invalid input: n=" + n + ", k=" + k);
        }

        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); 

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && readings[deque.peekLast()] <= readings[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = readings[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] readings = {4, 2, 9, 5, 6, 3, 8, 1};
        int k = 3;

        int[] result = maxThroughputWindow(readings, k);

        System.out.println("Readings: " + Arrays.toString(readings));
        System.out.println("Window size: " + k);
        System.out.println("Trailing max per window: " + Arrays.toString(result));
        
    }
}