package Mini_Project.presentation;

import java.util.Scanner;
import Mini_Project.models.Customer;
import Mini_Project.models.Log;
import Mini_Project.models.Pet;
import Mini_Project.models.ServiceTicket;
import Mini_Project.services.LogService;
import Mini_Project.services.PetService;
import Mini_Project.services.SpaService;
import Mini_Project.services.UserService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PetService petService = new PetService();
        UserService userService = new UserService();
        SpaService spaService = new SpaService();
        LogService logService = new LogService();

        int choice;

        do {
            System.out.println("\n===== PET KINGDOM =====");
            System.out.println("1. Quan ly Pet");
            System.out.println("2. Quan ly Khach hang");
            System.out.println("3. Spa Service");
            System.out.println("4. Nhat ky hoat dong");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    menuPet(sc, petService, logService);
                    break;

                case 2:
                    menuCustomer(sc, userService, logService);
                    break;

                case 3:
                    menuSpa(sc, petService, userService, spaService, logService);
                    break;
                case 4:
                    menuLog(sc, logService);
                    break;
                case 0:
                    System.out.println("Tam biet");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (choice != 0);

        sc.close();
    }

    // Pet Menu
    public static void menuPet(Scanner sc, PetService petService, LogService logService) {
        int choice;
        do {
            System.out.println("\n--- QUAN LY PET ---");
            System.out.println("1. Them pet");
            System.out.println("2. Hien thi tat ca");
            System.out.println("3. Tim theo id");
            System.out.println("4. Xoa pet");
            System.out.println("5. Cap nhat pet");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhap id: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap loai: ");
                    String spieces = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    double price = Double.parseDouble(sc.nextLine());
                    Pet pet = new Pet(id, name, spieces, choice, price);
                    petService.add(pet);
                    logService.saveAction(new Log("Them thu cung " + pet.getName(), pet));
                    break;

                case 2:
                    if (petService.isEmpty()) {
                        System.out.println("Danh sach trong");
                    } else {
                        petService.displayAll();
                    }
                    break;

                case 3:
                    System.out.print("Nhap id can tim: ");
                    Pet p = petService.findById(sc.nextLine());
                    System.out.println(p != null ? p : "Khong tim thay");
                    break;

                case 4:
                    System.out.print("Nhap id can xoa: ");
                    Pet pRemove = petService.findById(sc.nextLine());
                    if (pRemove != null) {
                        petService.remove(pRemove);
                        logService.saveAction(new Log("Xoa thu cung " + pRemove.getName(), pRemove));
                    } else {
                        System.out.println("Khong tim thay");
                    }
                    break;

                case 5:
                    System.out.print("Nhap id can cap nhat: ");
                    String idUpdate = sc.nextLine();
                    System.out.print("Nhap ten moi: ");
                    String newName = sc.nextLine();
                    System.out.print("Nhap loai moi: ");
                    String newSpieces = sc.nextLine();
                    System.out.print("Nhap gia moi: ");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    Pet newPet = new Pet(idUpdate, newName, newSpieces, choice, newPrice);
                    petService.update(newPet);
                    logService.saveAction(new Log("Cap nhat thong tin thu cung " + newPet.getName(), newPet));
                    break;
            }

        } while (choice != 0);
    }

    // Customer Menu
    public static void menuCustomer(Scanner sc, UserService userService, LogService logService) {
        int choice;
        do {
            System.out.println("\n--- QUAN LY KHACH HANG ---");
            System.out.println("1. Them khach hang");
            System.out.println("2. Hien thi tat ca");
            System.out.println("3. Tim theo so dien thoai");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhap id: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String phone = sc.nextLine();
                    Customer customer = new Customer(id, name, phone);
                    userService.add(customer);
                    logService.saveAction(new Log("Them khach hang " + customer, customer));
                    break;

                case 2:
                    userService.displayAll();
                    break;

                case 3:
                    System.out.print("Nhap so dien thoai: ");
                    Customer c = userService.findByPhone(sc.nextLine());
                    System.out.println(c != null ? c : "Khong tim thay");
                    break;
            }

        } while (choice != 0);
    }

    // Spa Menu
    public static void menuSpa(Scanner sc, PetService petService, UserService userService, SpaService spaService,
                               LogService logService) {

        int choice;
        do {
            System.out.println("\n--- SPA SERVICE ---");
            System.out.println("1. Tiep nhan pet");
            System.out.println("2. Xu ly pet");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma ve: ");
                    String ticketId = sc.nextLine();
                    System.out.print("Nhap ma pet: ");
                    String petId = sc.nextLine();
                    if (petService.findById(petId) == null) {
                        System.out.println("Khong tim thay ma thu cung");
                        return;
                    }
                    System.out.print("Nhap ma nguoi dung: ");
                    String customerId = sc.nextLine();
                    if (userService.findById(customerId) == null) {
                        System.out.println("Khong tim thay ma nguoi dung");
                        return;
                    }
                    System.out.print("Nhap loai dich vu: ");
                    String serviceType = sc.nextLine();
                    spaService.takePet(new ServiceTicket(ticketId, petId, customerId, serviceType));
                    logService.saveAction(new Log("Tiep nhan pet co ma " + petId, petId));
                    break;

                case 2:
                    ServiceTicket ticket = spaService.handlePet();
                    if (ticket != null) {
                        logService.saveAction(new Log("Xu ly pet ma co " + ticket.getPetId(), ticket));
                    }
                    System.out.println(ticket != null ? ticket : "Khong con pet nao");
                    break;
            }
        } while (choice != 0);

    }

    // Log Menu
    public static void menuLog(Scanner sc, LogService logService) {
        int choice;
        do {
            System.out.println("1. Xem nhat ky hoat dong");
            System.out.println("2. Undo");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Log log : logService.getAll()) {
                        System.out.println(log.getActionType());
                    }
                    break;

                default:
                    break;
            }
        } while (choice != 3);
    }
}
