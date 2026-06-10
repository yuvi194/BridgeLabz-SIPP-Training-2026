import java.util.*;
public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0;column < matrix[row].length;column++) {
                matrix[row][column] =sc.nextInt();
            }
        }
        int[] arr = new int[rows * columns];
        int i = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0;column < matrix[row].length;column++) {
                arr[i++] = matrix[row][column];
            }
        }
        System.out.println("1D Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}