package Intro;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == 0) {
            if (c == 0 && b == 0) {
                System.out.println("pt vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("pt vo nghiem");
            } else {
                int x = -c / b;
                System.out.println("x= " + x);
            }
        } else{
            double delta = Math.pow(b,2) - 4*a*c;
            if (delta < 0){
                System.out.println("Pt vo nghiem");
            } else if (delta == 0) {
                System.out.println("Pt co nghiem kep x= " + (-b/(2*a)));
            } else{
                System.out.println("x1= "+ ((-b + Math.sqrt(delta))/(2*a)) + " ");
                System.out.println("x2= "+ ((-b - Math.sqrt(delta))/(2*a)) + " ");
            }
        }
    }
}

