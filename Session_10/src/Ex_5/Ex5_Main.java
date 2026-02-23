package Ex_5;

public class Ex5_Main {
    public static void main(String[] args) {
        Employee officeStaff1 = new OfficeStaff("Nguyen Van A", 12000000);
        Employee officeStaff2 = new OfficeStaff("Nguyen Thi B", 15000000);
        Employee manager1 = new Manager("Nguyen Van C", 20000000, 0);
        Employee manager2 = new Manager("Nguyen Thi D", 22000000, 1500000);

        officeStaff1.printInfo();
        officeStaff2.printInfo();

        manager1.printInfo();
        manager2.printInfo();



    }
}
