class Student<T extends Number> {

    private T marks;

    public Student(T marks) {
        this.marks = marks;

    }

    public T getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("Marks: " + marks);
    }
}

public class ClassLevel {
    public static void main(String[] args) {

        Student<Integer> s1 = new Student<>(90);
        Student<Float> s2 = new Student<>(89.5f);
        Student<Double> s3 = new Student<>(95.75);

         s1.display();
         s2.display();
         s3.display();

    }
}