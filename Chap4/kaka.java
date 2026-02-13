package Chap4;

import java.util.Scanner;

public class kaka {
    public static void main(String[] args){
        Product sp = new Product();
        sp.nhapThongTin();
        sp.print(sp);
        Product sp1 = new Product("mit", 99, 0.21);
        Product sp2 = new Product("cam", 96, 0.069);
        sp1.print(sp1);
        sp2.print(sp2);
    }
}
