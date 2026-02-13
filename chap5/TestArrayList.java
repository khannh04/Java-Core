package chap5;

import java.util.Scanner;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while(true){
            double x = scanner.nextDouble();
            list.add(x);
            System.out.println("Nhap them (Y/N): ");
            String choice = scanner.next();
            if(choice.equalsIgnoreCase("N")){
                break;
            }
        }
        double tong = 0;
        for (int i = 0; i < list.size(); i++){
            tong += list.get(i);
        }
        System.out.println("Tong = "+tong);
//        String a = new String("abc");
//        String b = new String("abc");
//        System.out.println(a.equals(b));
    }
}
