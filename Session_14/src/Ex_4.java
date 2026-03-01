import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ex_4 {
    public static void main(String[] args) {

        List<String> danhSachCaBenh = new ArrayList<>();
        danhSachCaBenh.add("Cum A");
        danhSachCaBenh.add("Sot xuat huyet");
        danhSachCaBenh.add("Cum A");
        danhSachCaBenh.add("Covid-19");
        danhSachCaBenh.add("Cum A");
        danhSachCaBenh.add("Sot xuat huyet");

        Map<String, Integer> thongKe = new TreeMap<>();

        for (String benh : danhSachCaBenh) {
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        System.out.println("Bao cao thong ke dich te:");
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}