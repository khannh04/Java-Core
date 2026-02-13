package chap7;

public class Video42 {
    public static void main(String[] args) {
        ITStudent st1 = new ITStudent("java", "18", "khanhh", 36, 0.36);
        System.out.println("st1 check: " + st1.id);
        MEStudent st2 = new MEStudent("machine", "123", "kho", 3636, 0.63);
        System.out.println("st2 check: " + st2.name);
    }
}
