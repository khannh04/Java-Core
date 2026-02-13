package lap7;

public class Main {
    public static void main(String[] args) {
        Student st1 = new ITStudent(9.6, 6.9);
        Student st2 = new MEStudent(6.3, 3.6);
        System.out.println("Check IT: " + st1.getGrade());
        System.out.println("Check ME: " + st2.getGrade());
    }
}
