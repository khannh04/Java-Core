package lap9;

import java.util.Scanner;

public class Main {
    public static double Score(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grade: ");
        double score;
        while (true){
            try {
                score = scanner.nextDouble();
                return score;
            } catch (Exception e){
                System.out.println("Error");
                scanner.next();
            }
        }
    }
    public static int Age(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        int age;
        while (true){
            try {
                age = scanner.nextInt();
                if (age <= 0 || age > 100){
                    System.out.println("No valid");
                    continue;
                }
                return age;
            } catch (Exception e){
                System.out.println("Error");
                scanner.next();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        double score = Score();
        int age = Age();
        Studen st1 = new Studen(id, name, score, age);
        System.out.println(st1);
        scanner.close();
    }
}
