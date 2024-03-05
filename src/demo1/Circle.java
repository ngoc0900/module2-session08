package demo1;

import java.util.Scanner;

public class Circle extends Shape {
    private int bk;
    private float PI = 3.14F;

    public Circle() {

    }

    public Circle(int bk) {
        this.bk = bk;
    }

    public int getBk() {
        return bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }

    public float getPI() {
        return PI;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }

    public void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        this.bk = (int) Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình tròn là: " + (this.bk * this.bk * PI));

    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu của hình tròn");
        String color = scanner.nextLine();
        System.out.println("màu của hình tròn là: " + color);
    }


}
