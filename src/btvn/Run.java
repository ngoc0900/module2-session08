package btvn;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===========MENU============");
            System.out.println("1. Tính tiền lương parttime của nhân viên");
            System.out.println("2. Tính tiền lương fulltime của nhân viên");
            System.out.println("3. Thoaát");
            System.out.println("Mời bạn chọn 1 - 3");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
                    System.out.println("Nhập tên nhân viên");
                    partTimeEmployee.setName(scanner.nextLine());
                    System.out.println("Nhập tiền lương 1 giờ");
                    partTimeEmployee.setPaymentPerHour(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập số giờ làm việc");
                    partTimeEmployee.setWorkingHours(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Tiền lương parttime của " + partTimeEmployee.getName() + " là " + partTimeEmployee.calculateSalary());
                    break;
                case 2:
                    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
                    System.out.println("Nhập tên nhân viên");
                    fullTimeEmployee.setName(scanner.nextLine());
                    System.out.println("Nhập tiền lương 1 giờ");
                    fullTimeEmployee.setPaymentPerHour(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Tiền lương fullttime của " + fullTimeEmployee.getName() + " là " + fullTimeEmployee.calculateSalary());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");

                }
        } while (true);

    }
}
