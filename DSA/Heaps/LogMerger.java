import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class LogEntry {
    long timestamp;
    String message;

    public LogEntry(long timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }
}

public class LogMerger {

    public static List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {
        List<LogEntry> merged = new ArrayList<>();
        if (sources == null || sources.isEmpty()) return merged;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Long.compare(
                sources.get(a[0]).get(a[1]).timestamp,
                sources.get(b[0]).get(b[1]).timestamp
            )
        );

        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                minHeap.offer(new int[]{i, 0}); // {sourceIdx, elemIdx}
            }
        }

       while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int sourceIdx = top[0];
            int elemIdx = top[1];

            merged.add(sources.get(sourceIdx).get(elemIdx));

             if (elemIdx + 1 < sources.get(sourceIdx).size()) {
                minHeap.offer(new int[]{sourceIdx, elemIdx + 1});
            }
        }

        return merged;
    }
}

