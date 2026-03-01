import java.util.HashSet;
import java.util.Set;

public class Ex_3 {
    public static void main(String[] args) {

        Set<String> thanhPhanThuoc = new HashSet<>();
        thanhPhanThuoc.add("Aspirin");
        thanhPhanThuoc.add("Caffeine");
        thanhPhanThuoc.add("Paracetamol");

        Set<String> chatDiUng = new HashSet<>();
        chatDiUng.add("Penicillin");
        chatDiUng.add("Aspirin");

        Set<String> canhBaoDiUng = new HashSet<>(thanhPhanThuoc);
        canhBaoDiUng.retainAll(chatDiUng);

        Set<String> thanhPhanAnToan = new HashSet<>(thanhPhanThuoc);
        thanhPhanAnToan.removeAll(chatDiUng);

        System.out.println("Canh bao di ung: " + canhBaoDiUng);
        System.out.println("Thanh phan an toan: " + thanhPhanAnToan);
    }
}