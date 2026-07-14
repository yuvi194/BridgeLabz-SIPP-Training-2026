import java.io.*;
import java.util.HashMap;
public class BinarySearchTextFileWithoutCollections {
public static void main(String[] args) {
String filePath = "large_text_file.txt"; // Path to the text

file

String targetWord = "example"; // Word to search
// Read words from file and store in an array
String[] words = readWordsFromFile(filePath);
if (words == null) {

8

System.out.println("Error reading the file.");
return;
}
// Sort the words manually using QuickSort
quickSort(words, 0, words.length - 1);
// Perform Binary Search
int index = binarySearch(words, targetWord);
if (index != -1) {
System.out.println("Word found at index: " + index);
} else {
System.out.println("Word not found.");
}
}
// Method to read words from a file and store in an array
private static String[] readWordsFromFile(String filePath) {
try (BufferedReader br = new BufferedReader(new

FileReader(filePath))) {

StringBuilder sb = new StringBuilder();
String line;
while ((line = br.readLine()) != null) {
sb.append(line.toLowerCase().replaceAll("[^a-zA-Z ]",

"")).append(" ");
}
return sb.toString().split("\\s+"); // Convert text into

words array

} catch (IOException e) {
e.printStackTrace();
return null;
}
}
// Custom QuickSort for sorting words
private static void quickSort(String[] arr, int low, int high) {
if (low < high) {

9

int pi = partition(arr, low, high);
quickSort(arr, low, pi - 1);
quickSort(arr, pi + 1, high);
}
}
private static int partition(String[] arr, int low, int high) {
String pivot = arr[high];
int i = (low - 1);
for (int j = low; j < high; j++) {
if (arr[j].compareTo(pivot) <= 0) {
i++;
String temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
String temp = arr[i + 1];
arr[i + 1] = arr[high];
arr[high] = temp;
return i + 1;
}
// Custom Binary Search
private static int binarySearch(String[] words, String target) {
int left = 0, right = words.length - 1;
while (left <= right) {
int mid = left + (right - left) / 2;
int cmp = words[mid].compareTo(target);
if (cmp == 0) return mid; // Word found
else if (cmp < 0) left = mid + 1; // Search right
else right = mid - 1; // Search left
}
return -1; // Word not found
}
}