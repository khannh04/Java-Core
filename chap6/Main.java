package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student st1 = new Student("khas", 36);
        Student st2 = new Student("Nguyen", 63);
        Student st3 = new Student("van", 66);
        Student st4 = new Student("kho", 33);
        Student st5 = new Student("khanh", 96);
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);
        arr.add(st4);
        arr.add(st5);
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getName().startsWith("Nguyen")){
                System.out.println("start with Nguyen" + arr.get(i));
            }
        }
        System.out.println(">>> check arr: " + arr);
    }
}
