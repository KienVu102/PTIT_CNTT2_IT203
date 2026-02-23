package Ex_5;

import java.text.NumberFormat;

public class OfficeStaff extends Employee {
    public OfficeStaff() {
    }

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void printInfo() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Tên | " + name + " | Lương cơ bản | " + nf.format(calculateSalary()));
    }
}
