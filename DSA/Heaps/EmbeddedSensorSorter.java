public class EmbeddedSensorSorter {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Phase 1: Build Max-Heap in-place - O(n)
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDownMax(arr, i, n);
        }

        // Phase 2: Extract elements one by one from the heap - O(n log n)
        for (int end = n - 1; end > 0; end--) {
            // Move current root (maximum) to the end of array
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;

            // Restore max-heap property on the reduced active heap [0...end-1]
            siftDownMax(arr, 0, end);
        }
    }

    private static void siftDownMax(int[] arr, int i, int activeSize) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < activeSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < activeSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively sift down affected sub-tree
            siftDownMax(arr, largest, activeSize);
        }
    }
}
