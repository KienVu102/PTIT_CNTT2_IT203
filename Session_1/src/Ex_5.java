import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        int checkDigit = sumOfFirstThreeNumber % 10;

        boolean isValid = (checkDigit == units);

        System.out.println("Chữ số kiểm tra kỳ vọng: " + checkDigit);

        String result = isValid ? "HỢP LỆ" : "SAI MÃ";
        System.out.println("Kết quả kiểm tra mã sách: " + result);

        sc.close();
    }
}