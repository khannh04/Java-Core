package chap9;

import java.util.Scanner;

public class Video52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        try {
            System.out.println("Nhap: ");
            System.out.println("Kq: " + 10/x);
        } catch (Exception e) {
            System.out.println("run error with x = "+ x);
        }
    }
}
