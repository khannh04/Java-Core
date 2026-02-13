package Intro;

import java.util.Scanner;

public class In_Nhap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name = scanner.nextLine();
        System.out.println(("Your age is:"));
        int age = scanner.nextInt();
        System.out.println("Your name is "+ name +",age ="+ age);
        scanner.close();

    }
}
