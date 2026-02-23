package Ex_5;

import java.text.NumberFormat;

public class Manager extends Employee implements BonusCalculator{
    protected double bonus;

    public Manager() {
    }

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }

    @Override
    public void printInfo() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        if(bonus > 0){
            System.out.println("Tên | " + name + " | Lương cơ bản | " + nf.format(calculateSalary()) + " | Thưởng | " + getBonus());
        }else{
            System.out.println("Tên | " + name + " | Lương cơ bản | " + nf.format(calculateSalary()));
        }
    }
}
