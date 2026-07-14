import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            System.out.println("Stack Empty");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}

// Generic Repository
class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        System.out.println(data);
    }
}

// Student Entity
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

// Utility Class
class Utility {

    // Generic Method with Bounded Type
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T i : arr) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {
        for (Object i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class WildCard {

    public static void main(String[] args) {

        
        Pair<String, Integer> p = new Pair<>("Age", 21);
        p.display();

        
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("\nStack:");
        st.display();

        System.out.println("Popped: " + st.pop());
        st.display();

        Integer arr[] = {12, 45, 8, 90, 35};
        System.out.println("\nMaximum = " + Utility.findMax(arr));

        // Repository
        Repository<Student> repo = new Repository<>();
        repo.add(new Student(101, "Kartik"));
        repo.add(new Student(102, "Rahul"));

        System.out.println("\nRepository Data:");
        repo.display();

        // Wildcard
        List<String> names = Arrays.asList("Java", "Python", "C++");

        System.out.println("\nWildcard List:");
        Utility.printList(names);
    }
}