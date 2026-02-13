package lap8;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("18", "khannh", 20, 9);
        System.out.println("Check st1: " + st1);
        st1.setGrade();
        System.out.println("Check Grade st1: " + st1);
        Person p1 = new Person("123", "kho", 20);
        System.out.println(p1);


    }
}
