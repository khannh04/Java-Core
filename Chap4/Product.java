package Chap4;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double tax;
    public Product(){
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = scanner.nextLine();
        System.out.println("Price: ");
        this.price = scanner.nextDouble();
        System.out.println("Tax: ");
        this.tax = scanner.nextDouble();
    }
    // constructor
    public Product(String name, double price, double tax ){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    // getter(đọc dữ liệu trong private)
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getTax(){
        return tax;
    }
    // setter(thay đổi dữ liệu trong private)
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setTax(double tax){
        this.tax = tax;
    }
    // tính thuế
    public double getTaxPrice(){
        return price * tax;
    }
    public void print(Product pr){
        System.out.println("Tên: " + pr.getName());
        System.out.println("Giá: " + pr.getPrice());
        System.out.println("Thuế: " + pr.getTax());
        System.out.println("Giá thuế: " + getTaxPrice() );

    }

}
