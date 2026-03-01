import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PatientEx6 {
    String name;
    int age;
    String khoa;

    public PatientEx6(String name, int age, String khoa) {
        this.name = name;
        this.age = age;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuoi)";
    }
}

public class Ex_6 {
    public static void main(String[] args) {

        List<PatientEx6> danhSachBenhNhan = new ArrayList<>();
        danhSachBenhNhan.add(new PatientEx6("Lan", 30, "Tim mach"));
        danhSachBenhNhan.add(new PatientEx6("Hung", 45, "Noi tiet"));
        danhSachBenhNhan.add(new PatientEx6("Mai", 25, "Tim mach"));
        danhSachBenhNhan.add(new PatientEx6("An", 60, "Tim mach"));

        Map<String, List<PatientEx6>> benhNhanTheoKhoa = new HashMap<>();

        for (PatientEx6 p : danhSachBenhNhan) {
            if (!benhNhanTheoKhoa.containsKey(p.khoa)) {
                benhNhanTheoKhoa.put(p.khoa, new ArrayList<>());
            }
            benhNhanTheoKhoa.get(p.khoa).add(p);
        }

        System.out.println("Danh sach benh nhan theo khoa:");
        for (String khoa : benhNhanTheoKhoa.keySet()) {
            System.out.println("Khoa: " + khoa);
            for (PatientEx6 p : benhNhanTheoKhoa.get(khoa)) {
                System.out.println("  - " + p);
            }
        }
    }
}
