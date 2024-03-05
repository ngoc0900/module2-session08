package demo1;

import java.util.Scanner;
public class Rectangle extends Shape {
    private int with;
    private int height ;

    public Rectangle() {
    }

    public Rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhât");
        double dai = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng hình cn: ");
        double rong = Double.parseDouble(scanner.nextLine());
        System.out.println("diện tích hcn là: " + dai*rong);
    }

    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu của hình chữ nhât");
        String color = scanner.nextLine();
        System.out.println("màu của hcn là: " + color);
    }
}
