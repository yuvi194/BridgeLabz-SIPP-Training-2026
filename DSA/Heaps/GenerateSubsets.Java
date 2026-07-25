import java.util.ArrayList;
public class GenerateSubsets {
    static void subsets(int[] arr, int index, ArrayList<Integer> current) {
        
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
    
        subsets(arr, index + 1, current);
        
        current.add(arr[index]);
        subsets(arr, index + 1, current);
    
        current.remove(current.size() - 1);
    }
    public static void main(String[] args) {

        int[] arr = {1, 2};
        ArrayList<Integer> current = new ArrayList<>();
        subsets(arr, 0, current);
    }
}