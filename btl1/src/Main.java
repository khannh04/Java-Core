import java.util.Arrays;

class Student {
    private String name;
    private int[] grade;

    public Student(String name, int[] grade){
        this.grade = grade != null ? grade : new int[0];
        this.name = name;
    }

    public double Average(){
        int sum = 0;
        for (int grade : grade){
            sum += grade;
        }
        return (double) sum/grade.length;
    }

    public boolean Deter(){
        return Average() >= 50;
    }

    public int Highest(){
        int max = grade[0];
        for(int grade : grade){
            if(max < grade){
                max = grade;
            }
        }
        return max;
    }

    public void display() {
        System.out.println("Name:          " + name);
        System.out.println("Grades:        " + Arrays.toString(grade));
        System.out.println("Average Score: " + String.format("%.2f", Average()));
        System.out.println("Highest Grade: " + Highest());
        System.out.println("Status:        " + (Deter() ? "PASSED" : "FAILED"));

    }
}

public class Main {
    public static void main(String[] args) {
        int[] grades = {70, 85, 40, 90, 60};
        Student student = new Student("Alice", grades);

        student.display();
    }
}